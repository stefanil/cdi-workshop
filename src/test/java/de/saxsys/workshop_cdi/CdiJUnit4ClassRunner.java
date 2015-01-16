package de.saxsys.workshop_cdi;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.apache.deltaspike.core.api.projectstage.ProjectStage;
import org.apache.deltaspike.core.api.provider.BeanProvider;
import org.apache.deltaspike.core.util.ProjectStageProducer;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * CdiJunitClassRunner
 * Starts the CDI-Container for testing CDI beans.
 * 
 * @author ralf.rossmueller
 *
 */
public class CdiJUnit4ClassRunner extends BlockJUnit4ClassRunner {

	private Class<?> clazz;
    private CdiContainer container;

    public CdiJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
        this.clazz = clazz;
        ProjectStageProducer.setProjectStage(ProjectStage.UnitTest);
        container = CdiContainerLoader.getCdiContainer();
        container.boot();
        container.getContextControl().startContexts();
    }

    @Override
    protected Object createTest() throws Exception {
    	return BeanProvider.getContextualReference(clazz);
    }
	
}
