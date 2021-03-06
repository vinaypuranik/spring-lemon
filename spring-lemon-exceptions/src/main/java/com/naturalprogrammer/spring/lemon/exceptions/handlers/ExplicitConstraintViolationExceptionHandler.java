package com.naturalprogrammer.spring.lemon.exceptions.handlers;

import java.util.Collection;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.naturalprogrammer.spring.lemon.exceptions.ExplicitConstraintViolationException;
import com.naturalprogrammer.spring.lemon.exceptions.LemonFieldError;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class ExplicitConstraintViolationExceptionHandler
	extends ConstraintViolationExceptionHandler<ExplicitConstraintViolationException> {

	public ExplicitConstraintViolationExceptionHandler() {
		
		super(ExplicitConstraintViolationException.class.getSimpleName());
		log.info("Created");
	}
		
	@Override
	public Collection<LemonFieldError> getErrors(ExplicitConstraintViolationException ex) {
		return LemonFieldError.getErrors(ex);
	}
}
