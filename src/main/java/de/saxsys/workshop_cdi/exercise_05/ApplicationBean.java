package de.saxsys.workshop_cdi.exercise_05;

// TODO Assign bean to application scope.
public class ApplicationBean {
	
	private int counter;
	
	public ApplicationBean() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void count() {
		counter++;
	}
	
}
