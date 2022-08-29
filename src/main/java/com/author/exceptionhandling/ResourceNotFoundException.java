package com.author.exceptionhandling;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID=1l;
	 
	private String  resourcename;
	private String fieldName;
	private String fieldValue;
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	public ResourceNotFoundException(String resourcename, String fieldName, String fieldValue) {
		
		super(String.format("%s not found with the %s:%s",resourcename,fieldName,fieldValue));
		this.resourcename = resourcename;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
			
	}


