package de.saxsys.workshop_cdi.exercise_03;

import javax.inject.Inject;

public class NumberService {
	
	@Inject
	private NumberRepository repository;

	public String save(Integer number) {
		// Do something sophisticated with the number;
		
		// Save number with nNumberRepository
		return repository.save(number);
	}
	
}
