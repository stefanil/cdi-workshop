package de.saxsys.workshop_cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.api.projectstage.ProjectStage;
import org.apache.deltaspike.core.api.provider.BeanProvider;
import org.apache.deltaspike.core.util.ProjectStageProducer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class CdiContainerTest {
	
	private static ContextControl contextControl;
	
	public ContextControl getContextControl() {
		return contextControl;
	}
	
	@BeforeClass
	public static void setUpBeforeClass() {
		ProjectStageProducer.setProjectStage(ProjectStage.UnitTest);
		contextControl = BeanProvider.getContextualReference(ContextControl.class);
	}
	
	@Before
	public void setUp() {
		getContextControl().startContexts();
	}
	
	@After
	public void tearDown() {
		getContextControl().stopContexts();
	}
	
	public void restartApplicationContext() {
		getContextControl().stopContext(ApplicationScoped.class);
		restartSessionContext();
		getContextControl().startContext(ApplicationScoped.class);
	}
	
	public void restartSessionContext() {
		getContextControl().stopContext(SessionScoped.class);
		restartRequestContext();
		getContextControl().startContext(SessionScoped.class);
	}

	public void restartRequestContext() {
		getContextControl().stopContext(RequestScoped.class);
		getContextControl().startContext(RequestScoped.class);
	}

}
