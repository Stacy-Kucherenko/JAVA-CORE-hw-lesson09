package lviv.lgs.ua.myExceptionHW;

public class MyException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public MyException(String message) {
		super(message);
		this.message = message;
	} 
	
	
	
	
	
}
