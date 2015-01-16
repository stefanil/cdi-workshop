package de.saxsys.workshop_cdi.exercise_06;

@Spy
public class MailService {

	public String sendMessage(String message) {
		return "Send message: " + message;
	}
	
}
