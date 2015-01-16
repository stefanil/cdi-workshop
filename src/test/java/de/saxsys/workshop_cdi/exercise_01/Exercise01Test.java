package de.saxsys.workshop_cdi.exercise_01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise01Test extends CdiContainerTest {

	private static final String DEFAULT_GREETINGS = "Hello from CDI.";
	
	@Inject
	private FieldInjection fieldInjection;
	@Inject
	private MethodInjection methodInjection;
	@Inject
	private ConstructorInjection constructorInjection;
	
	@Test
	public void testFieldInjection() {
		CDIGreeting greeting = fieldInjection.getGreeting();
        assertNotNull("CDIGreetingBean wurde nicht injiziert.", greeting);
        String greetings = fieldInjection.greet();
        assertEquals(DEFAULT_GREETINGS, greetings);
	}

	@Test
	public void testMethodInjection() {
		CDIGreeting greeting = methodInjection.getGreeting();
        assertNotNull("CDIGreetingBean wurde nicht injiziert.", greeting);
        String greetings = methodInjection.greet();
        assertEquals(DEFAULT_GREETINGS, greetings);
	}

	@Test
	public void testConstructorInjection() {
		CDIGreeting greeting = constructorInjection.getGreeting();
        assertNotNull("CDIGreetingBean wurde nicht injiziert.", greeting);
        String greetings = constructorInjection.greet();
        assertEquals(DEFAULT_GREETINGS, greetings);
	}

}
