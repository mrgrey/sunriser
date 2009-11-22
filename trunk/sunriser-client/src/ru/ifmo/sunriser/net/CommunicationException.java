package ru.ifmo.sunriser.net;

/**
 *
 * @author mrgrey
 */
public class CommunicationException extends Exception {

	private Exception innerException;

	public Exception getInnerException() {
		return innerException;
	}

	public CommunicationException(String message, Exception innerException) {
		super(message);
		this.innerException = innerException;	
	}

	public CommunicationException(String message) {
		super(message);
	}

	public CommunicationException() {
		super();
	}

}
