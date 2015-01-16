package de.saxsys.workshop_cdi.exercise_01;

import javax.inject.Inject;

public class MethodInjection {
	
	private CDIGreeting greeting;

	public CDIGreeting getGreeting() {
		return greeting;
	}
	
	@Inject
	protected void setCDIGreeting(CDIGreeting greeting) {
		this.greeting = greeting;
	}
	
	public String greet() {
		return greeting.sayHello();
	}
	
}
