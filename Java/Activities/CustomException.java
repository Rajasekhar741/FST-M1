package activities;

@SuppressWarnings("serial")
public class CustomException extends Exception{
	
	private String msg = null;
	
	//constructor
	public CustomException(String message) {
		this.msg = message;
	}
	
	
	@Override
    public String getMessage() {
        return msg;
	}
	
	
	

}
