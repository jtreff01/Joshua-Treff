package edu.tufts.sweclass;

public class StudentIndexOutOfBoundsException extends RuntimeException {
	private static final long serialVersionUID = 8226094121089000000L;

	public StudentIndexOutOfBoundsException(String Message) {
		super(Message);
	}

	public StudentIndexOutOfBoundsException() {
		super();
	}
}
