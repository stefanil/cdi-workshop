package de.saxsys.workshop_cdi.exercise_04;

public class User {
	
	private String firstName;
	private String lastName;
	
	// TODO Remove constructor to resolve AmbigousResolutionException
	public User() {
		this.firstName = "";
		this.lastName = "";
	}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
}
