package ejercicio3.model;

public class MaquinaException extends RuntimeException {

	public MaquinaException() {
		super();
	}

	public MaquinaException(String message, Throwable cause) {
		super(message, cause);
	}

	public MaquinaException(String message) {
		super(message);
	}
}
