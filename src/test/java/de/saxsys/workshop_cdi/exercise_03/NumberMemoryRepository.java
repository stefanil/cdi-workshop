package de.saxsys.workshop_cdi.exercise_03;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Mock
//@Vetoed // <- Delete this
public class NumberMemoryRepository implements NumberRepository {

	private static final String MESSAGE_SAVE = "Number saved in memory";
	
	private List<Integer> memory;
	
	@PostConstruct
	private void initialize() {
		memory = new ArrayList<>();
	}
	
	@Override
	public String save(Integer number) {
		memory.add(number);
		return MESSAGE_SAVE;
	}


}
