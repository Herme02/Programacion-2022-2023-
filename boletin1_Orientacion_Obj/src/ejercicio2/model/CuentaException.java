package ejercicio2.model;

public class CuentaException extends RuntimeException {

	public CuentaException() {
		super();
	}

	public CuentaException(String message, Throwable cause) {
		super(message, cause);
	}

	public CuentaException(String message) {
		super(message);
	}
}
