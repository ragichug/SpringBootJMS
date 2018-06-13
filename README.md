# SpringBootJMS

This project utilizes Spring Boot framework to implement Java Message Service. To implement it, the application comprises of 
two major components: 

  TestSender : It is responsible for creating a message queue using embedded broker and stream messages asynchronously.
  TestReceiver : It is responsible for constantly pulling/ fetching messages from the queue.
 
 
 The message queue that uses embedded broker runs on a VM host managed actively by Spring Boot.
 



Steps for installation :
1. Clone the repository to your local machine.
2. Import the project in Intellij/ Eclipse.
3. Build it with all the necessary maven dependencies.
4. In the TestApp class, specify the text that you intend to send inside the run method.  
