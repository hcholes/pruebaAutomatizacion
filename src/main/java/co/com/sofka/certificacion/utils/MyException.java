package co.com.sofka.certificacion.utils;

import java.util.logging.Logger;

public class MyException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger("");
	public static final  String EXCEP_LOG="Exception";
	public static final String INTERRUPTED_LOG="Interrupted";
	
	MyException() {
		super();
	}
	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}
	public MyException(String message) {
		super(message);
	}
	public MyException(Throwable cause) {
		super(cause);
	}
	public MyException(Error cause) {
		super(cause);
	}
	
	public static Logger logger() {
		return LOGGER;
	}
}
