package com.cg.customer.exceptions;

public class InvalidCustomerNameException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCustomerNameException() {		
	}
	
	public InvalidCustomerNameException(String msg) {
		super(msg);
	}
	
	

}
