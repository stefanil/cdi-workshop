package de.saxsys.workshop_cdi.exercise_04;

import javax.inject.Inject;

public class UserService {

	@Inject
	private User currentUser;
	
	public User getCurrentUser() {
		return currentUser;
	}
	
	public String getFormattedName() {
		return currentUser.getLastName() + ", " + currentUser.getFirstName();
	}
	
}
