package tester;

import java.util.InputMismatchException;

public class InvalidException extends InputMismatchException{
private String message;
public InvalidException(String message) {
	this.message = message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getMessage() {
		return this.message;
	}
}
