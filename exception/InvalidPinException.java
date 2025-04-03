package exception;

public class InvalidPinException extends RuntimeException {
//	private String message;
	public InvalidPinException(String message) {
		super(message);
	}
//	
//	public String getMessage() {
//		return message;
//	}

}
