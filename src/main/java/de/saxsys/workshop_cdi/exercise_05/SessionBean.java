package de.saxsys.workshop_cdi.exercise_05;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class SessionBean implements Serializable {
	
	private static final long serialVersionUID = -4870364969700156803L;

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
