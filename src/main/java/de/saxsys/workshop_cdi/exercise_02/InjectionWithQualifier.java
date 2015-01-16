package de.saxsys.workshop_cdi.exercise_02;

import javax.inject.Inject;

public class InjectionWithQualifier {

	/*
	 * ############### Inject services with different qualifiers. ##############
	 */
	
	@Inject @Greeting(GreetingType.DEFAULT)
	private GreetingService defaultGreeting;
	
	@Inject @Greeting(GreetingType.FORMAL)
	private GreetingService formalGreeting; 
	
	/*
	 * #########################################################################
	 */
	
	public GreetingService getDefaultGreeting() {
		return defaultGreeting;
	}
	
	public String greet(String name) {
		return defaultGreeting.greet(name);
	}
	
	public GreetingService getFormalGreeting() {
		return formalGreeting;
	}
	
	public String greetFormal(String name) {
		return formalGreeting.greet(name);
	}
	
}
