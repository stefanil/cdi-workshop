package de.saxsys.workshop_cdi.exercise_06;

import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/*
 * Register this interceptor to CDI.
 */
@Spy
@Interceptor
public class SpyInterceptor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	SpyBean spyBean;
	
	@AroundInvoke
	public Object spyMethodCall(InvocationContext invocationContext) throws Exception {
		spyBean.setLastMethod(invocationContext.getMethod().getName());
		spyBean.setMessageIn(invocationContext.getParameters()[0].toString());
		Object result = invocationContext.proceed();
		spyBean.setMessageOut(result.toString());
		return result;
	}

}
