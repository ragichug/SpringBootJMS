package embeddedmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Session;

@Component
public class Receiver{

    private static Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @JmsListener(destination = "MessageQueue")
    public void receiveMessage(String message) {

        LOGGER.info(" Received message: " + message);

    }

}
