package de.saxsys.workshop_cdi.exercise_04;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise04Test extends CdiContainerTest {
	
	private static final String DEFAULT_USER_NAME = "Superuser, Max";

	@Inject
	private UserService userService;
	
	@Test
	public void testUserService() {
		String formattedName = userService.getFormattedName();
		assertEquals(DEFAULT_USER_NAME, formattedName);
	}

}
