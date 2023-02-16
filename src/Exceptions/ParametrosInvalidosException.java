package Exceptions;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String msg;

	public ParametrosInvalidosException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}
	
}
