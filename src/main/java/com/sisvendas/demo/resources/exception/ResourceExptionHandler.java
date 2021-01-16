package com.sisvendas.demo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sisvendas.demo.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExptionHandler {

	public ResponseEntity<StandarError> objNotFound (ObjectNotFoundException e, HttpServletRequest request){
		
		@ExceptionHandler(ObjectNotFoundException.class)
		StandarError err = new StandarError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}
}