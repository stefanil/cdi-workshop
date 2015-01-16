package de.saxsys.workshop_cdi.exercise_06;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise06Test extends CdiContainerTest {
	
	@Inject
	private MailService mailService;
	@Inject
	private SpyBean spyBean;
	
	@Test
	public void testSpyInterceptor() {
		spyBean.initialize();
		String messageIn = "Top Secret";
		String messageOut = mailService.sendMessage(messageIn);
		assertEquals("sendMessage", spyBean.getLastMethod());
		assertEquals(messageIn, spyBean.getMessageIn());
		assertEquals(messageOut, spyBean.getMessageOut());
	}

}
