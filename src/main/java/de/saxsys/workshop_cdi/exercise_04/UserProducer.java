package de.saxsys.workshop_cdi.exercise_04;

import javax.enterprise.inject.Produces;

public class UserProducer {

	@Produces
	public User createCurrentUser() {
		return new User("Max", "Superuser");
	}
	
}
