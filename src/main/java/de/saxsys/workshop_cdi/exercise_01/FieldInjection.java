package de.saxsys.workshop_cdi.exercise_01;

import javax.inject.Inject;

public class FieldInjection {

	@Inject
	private CDIGreeting greeting;
	
	public CDIGreeting getGreeting() {
		return greeting;
	}
	
	public String greet() {
		return greeting.sayHello();
	}
	
}
