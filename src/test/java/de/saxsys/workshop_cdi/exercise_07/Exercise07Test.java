package de.saxsys.workshop_cdi.exercise_07;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise07Test extends CdiContainerTest {
	
	@Inject
	private MessageSender sender;
	@Inject
	private MessageReceiver receiver;
	
	@Test
	public void testSendAndReceiveMessage() {
		receiver.initialize();
		String message = "Rapunzel, Rapunzel lass dein Haar herab.";
		sender.sendMessage(message);
		assertEquals(message, receiver.getMessage());
	}

}
