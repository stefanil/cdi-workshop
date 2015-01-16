package de.saxsys.workshop_cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * WeldJunitClassRunner
 * Starts the Weld-Container for testing CDI beans.
 * 
 * @author ralf.rossmueller
 *
 */
public class WeldJUnit4ClassRunner extends BlockJUnit4ClassRunner {

	private Class<?> clazz;
    private Weld weld;
    private WeldContainer container;
    
    public WeldJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
        this.clazz = clazz;
        this.weld = new Weld();
        this.container = weld.initialize();
    }

    @Override
    protected Object createTest() throws Exception {
        return container.instance().select(clazz).get();
    }

}
