package de.saxsys.workshop_cdi.exercise_07;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;

@Singleton
public class MessageReceiver {

	private String message;
	
	public void initialize() {
		this.message = null;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void receive(@Observes Message messageEvent) {
		message = messageEvent.getMessage();
	}
	
}
