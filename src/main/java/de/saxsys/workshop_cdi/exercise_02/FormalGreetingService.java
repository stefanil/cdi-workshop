package de.saxsys.workshop_cdi.exercise_02;

/* 
 * Define this greeting service with qualifier greeting using parameter.
 */
@Greeting(GreetingType.FORMAL)
public class FormalGreetingService implements GreetingService {

	@Override
	public String greet(String name) {
		return "Dear " + name;
	}

}
