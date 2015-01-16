package de.saxsys.workshop_cdi.exercise_02;

/* 
 * Define this greeting service with qualifier greeting using parameter.
 */
@Greeting(GreetingType.DEFAULT)
public class DefaultGreetingService implements GreetingService {

	@Override
	public String greet(String name) {
		return "Hello " + name;
	}
	
}
