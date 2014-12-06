package br.com.cdsl.annotations.field;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Size {
/*
 * Incluir se o usuario quer usar os valores entre -100 e -80
 * S�o minimo e m�ximo respectivamente
 */
	int min() default 0;
	int max() default 0;
	Class<? extends Exception> exception() default java.lang.Exception.class;
	String messageException() default "";
}
