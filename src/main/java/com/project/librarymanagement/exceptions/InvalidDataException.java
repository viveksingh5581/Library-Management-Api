package com.project.librarymanagement.exceptions;

public class InvalidDataException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InvalidDataException() {
		super();
	}
	
	public  InvalidDataException(final String message) {
		super(message);
	}
	
	public InvalidDataException(final String message, final Throwable throwable) {
		super(message, throwable);
	}
}
