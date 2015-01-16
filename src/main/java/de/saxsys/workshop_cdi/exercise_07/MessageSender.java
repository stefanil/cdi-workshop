package de.saxsys.workshop_cdi.exercise_07;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MessageSender {
	
	@Inject
	Event<Message> messageEvent;
	
	public void sendMessage(String message) {
		messageEvent.fire(new Message(message));
	}

}
