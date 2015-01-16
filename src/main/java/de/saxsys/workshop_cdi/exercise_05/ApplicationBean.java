package de.saxsys.workshop_cdi.exercise_05;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
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
