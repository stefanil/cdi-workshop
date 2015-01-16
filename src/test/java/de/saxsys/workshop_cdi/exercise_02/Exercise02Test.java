package de.saxsys.workshop_cdi.exercise_02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise02Test extends CdiContainerTest {

	private static final String USER_NAME = "User";
	private static final String DEFAULT_GREETINGS = "Hello User";
	private static final String FORMAL_GREETINGS = "Dear User";

	@Inject
	private InjectionWithQualifier service;
	
	@Test
	public void testDefaultGreeting() {
        assertNotNull("GreetingService wurde nicht injiziert.", service.getDefaultGreeting());
        String greetings = service.greet(USER_NAME);
        assertEquals(DEFAULT_GREETINGS, greetings);
	}

	@Test
	public void testFormalGreeting() {
        assertNotNull("GreetingService wurde nicht injiziert.", service.getFormalGreeting());
        String greetings = service.greetFormal(USER_NAME);
        assertEquals(FORMAL_GREETINGS, greetings);
	}

}
