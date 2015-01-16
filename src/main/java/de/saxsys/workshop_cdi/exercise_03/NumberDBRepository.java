package de.saxsys.workshop_cdi.exercise_03;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class NumberDBRepository implements NumberRepository {

	private static final String MESSAGE_SAVE = "Number saved in database";
	
	private List<Integer> db;
	
	@PostConstruct
	private void initialize() {
		db = new ArrayList<>();
	}
	
	@Override
	public String save(Integer number) {
		db.add(number);
		return MESSAGE_SAVE;
	}

}
