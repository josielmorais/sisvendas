package com.sisvendas.demo.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException(String msn) {
		super(msn);
		
	}
	
	public DataIntegrityException(String msn, Throwable cause) {
		super(msn,cause);
		
	}
	

}
