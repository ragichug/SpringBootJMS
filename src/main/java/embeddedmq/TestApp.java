package embeddedmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.concurrent.TimeUnit;

// Enable if you want to configure an embedded activeMQ server using Spring XML Configuration
// @Configuration
// @ImportResource(value = "classpath:spring-activemq-config.xml")
@SpringBootApplication
public class TestApp implements ApplicationRunner {

    private static Logger log = LoggerFactory.getLogger(TestApp.class);

    @Autowired
    private Sender sender;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Boot Embedded ActiveMQ Configuration Example");
        while(true) {
            for (int i = 0; i < 5; i++) {
                String myMessage = i + " - Sending JMS Message using Embedded activeMQ" + new Date().toString();
                sender.send(myMessage);
            }

            log.info("Waiting for all ActiveMQ JMS Messages to be consumed");
            TimeUnit.SECONDS.sleep(3);
        }


    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestApp.class, args);
    }
}

