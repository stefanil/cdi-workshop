package de.saxsys.workshop_cdi.exercise_05;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.saxsys.workshop_cdi.CdiContainerTest;
import de.saxsys.workshop_cdi.CdiJUnit4ClassRunner;

@RunWith(CdiJUnit4ClassRunner.class)
public class Exercise05Test extends CdiContainerTest {

	@Inject
	private ApplicationBean applicationBean;
	@Inject
	private SessionBean sessionBean;
	@Inject
	private RequestBean requestBean;
	
	@Test
	public void testApplicationBean() {
		applicationBean.count();
		assertEquals(1, applicationBean.getCounter());
		applicationBean.count();
		assertEquals(2, applicationBean.getCounter());
		restartApplicationContext();
		assertEquals(0, applicationBean.getCounter());
		applicationBean.count();
		assertEquals(1, applicationBean.getCounter());
		applicationBean.count();
		assertEquals(2, applicationBean.getCounter());
		restartSessionContext();
		assertEquals(2, applicationBean.getCounter());
		applicationBean.count();
		restartRequestContext();
		assertEquals(3, applicationBean.getCounter());
	}

	@Test
	public void testSessionBean() {
		sessionBean.count();
		assertEquals(1, sessionBean.getCounter());
		restartApplicationContext();
		assertEquals(0, sessionBean.getCounter());
		sessionBean.count();
		assertEquals(1, sessionBean.getCounter());
		sessionBean.count();
		assertEquals(2, sessionBean.getCounter());
		restartSessionContext();
		assertEquals(0, sessionBean.getCounter());
		sessionBean.count();
		assertEquals(1, sessionBean.getCounter());
		sessionBean.count();
		assertEquals(2, sessionBean.getCounter());
		restartRequestContext();
		assertEquals(2, sessionBean.getCounter());
	}

	@Test
	public void testRequestBean() {
		requestBean.count();
		assertEquals(1, requestBean.getCounter());
		restartApplicationContext();
		assertEquals(0, requestBean.getCounter());
		requestBean.count();
		assertEquals(1, requestBean.getCounter());
		requestBean.count();
		assertEquals(2, requestBean.getCounter());
		restartSessionContext();
		assertEquals(0, requestBean.getCounter());
		requestBean.count();
		assertEquals(1, requestBean.getCounter());
		requestBean.count();
		assertEquals(2, requestBean.getCounter());
		restartRequestContext();
		assertEquals(0, requestBean.getCounter());
		requestBean.count();
		assertEquals(1, requestBean.getCounter());
		requestBean.count();
		assertEquals(2, requestBean.getCounter());
	}

}
