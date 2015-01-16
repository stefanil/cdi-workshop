package de.saxsys.workshop_cdi.exercise_06;

import javax.inject.Singleton;

@Singleton
public class SpyBean {

	private String lastMethod;
	private String messageIn;
	private String messageOut;

	public void initialize() {
		this.lastMethod = null;
		this.messageIn = null;
		this.messageOut = null;
	}
	
	public String getLastMethod() {
		return lastMethod;
	}
	
	public void setLastMethod(String lastMethod) {
		this.lastMethod = lastMethod;
	}
	
	public String getMessageIn() {
		return messageIn;
	}
	
	public void setMessageIn(String messageIn) {
		this.messageIn = messageIn;
	}
	
	public String getMessageOut() {
		return messageOut;
	}
	
	public void setMessageOut(String messageOut) {
		this.messageOut = messageOut;
	}
	
}
