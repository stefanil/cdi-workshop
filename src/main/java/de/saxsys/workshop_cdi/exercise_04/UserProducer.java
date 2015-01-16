package de.saxsys.workshop_cdi.exercise_04;

public class UserProducer {

	// TODO Annotate method as producer method for User("Max", "Superuser").
	public User createCurrentUser() {
		return new User("Max", "Superuser");
	}
	
}
