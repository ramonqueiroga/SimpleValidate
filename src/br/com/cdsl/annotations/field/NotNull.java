package br.com.cdsl.annotations.field;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface NotNull{
	
	Class<? extends Exception> exception() default java.lang.Exception.class;
	String messageException() default "";
}