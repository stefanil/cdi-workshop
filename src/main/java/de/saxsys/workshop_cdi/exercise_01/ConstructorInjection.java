package de.saxsys.workshop_cdi.exercise_01;

import javax.inject.Inject;

public class ConstructorInjection {

	private CDIGreeting greeting;

	public CDIGreeting getGreeting() {
		return greeting;
	}
	
	protected ConstructorInjection() {}
	
	@Inject
	protected ConstructorInjection(CDIGreeting greeting) {
		this.greeting = greeting;
	}
	
	public String greet() {
		return greeting.sayHello();
	}

}
