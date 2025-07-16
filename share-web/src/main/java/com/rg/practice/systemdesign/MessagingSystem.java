/**
 * 
 */
package com.rg.practice.systemdesign;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 */
public class MessagingSystem {

}
 interface Messenger {
    void send(Message message);
    Message receive();
}
 class Message {
    private String id;
    private String type;    // e.g. "NOTIFICATION", "ALERT"
    private String payload; // Message data (could be JSON/XML/string)
    private Date timestamp;

    // Constructors, getters, setters...
}
  class NotificationQueue implements Messenger {
	    private BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

	    @Override
	    public void send(Message message) {
	        queue.offer(message);
	    }

	    @Override
	    public Message receive() {
	        try {
	            return queue.take(); // blocks if empty
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            return null;
	        }
	    }
	}
//Consumer
class NotificationConsumer implements Runnable {
 private Messenger messenger;

 public NotificationConsumer(Messenger messenger) {
     this.messenger = messenger;
 }
 @Override
 public void run() {
     Message message = messenger.receive();
     //System.out.println("Received message: " + message.getPayload());
 }
}

//Producer
class NotificationProducer implements Runnable {
 private Messenger messenger;

 public NotificationProducer(Messenger messenger) {
     this.messenger = messenger;
 }
 @Override
 public void run() {
     Message message = new Message();
     messenger.send(message);
 }
}