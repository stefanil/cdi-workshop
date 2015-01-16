package de.saxsys.workshop_cdi.exercise_05;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestBean {
	
	private int counter;
	
	public RequestBean() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void count() {
		counter++;
	}

}
