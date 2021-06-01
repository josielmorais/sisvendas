package com.sisvendas.demo.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String fielName;
	private String massage;
	
	public FieldMessage() {
	
	}
	
	public FieldMessage(String fielName, String massage) {
		super();
		this.fielName = fielName;
		this.massage = massage;
	}

	public String getFielName() {
		return fielName;
	}

	public void setFielName(String fielName) {
		this.fielName = fielName;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	
	
	

}
