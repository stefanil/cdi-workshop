package de.saxsys.workshop_cdi.exercise_06;

import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target({METHOD, TYPE})
public @interface Spy {

}
