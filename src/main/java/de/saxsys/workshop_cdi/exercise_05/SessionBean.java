package de.saxsys.workshop_cdi.exercise_05;

// TODO Assign bean to session scope and make it serializable.
public class SessionBean {
	
	private int counter;
	
	public SessionBean() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void count() {
		counter++;
	}
	
}
