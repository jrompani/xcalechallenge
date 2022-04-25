package com.xcalechallenge.app.exceptions;

public class ContactNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ContactNotFoundException() {
		super("Contact not found");
	}

}
