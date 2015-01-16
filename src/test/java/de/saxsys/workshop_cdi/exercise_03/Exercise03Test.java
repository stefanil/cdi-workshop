package de.saxsys.workshop_cdi.exercise_03;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise03Test extends CdiContainerTest {

	private static final String MESSAGE_SAVE = "Number saved in memory";
	
	@Inject
	private NumberService service;
	
	@Test
	public void testNumberService() {
        String message = service.save(1000);
        assertEquals(MESSAGE_SAVE, message);
	}

}
