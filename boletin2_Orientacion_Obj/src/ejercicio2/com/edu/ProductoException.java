package ejercicio2.com.edu;

public class ProductoException extends RuntimeException {

	public ProductoException() {
		super();
	}

	public ProductoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductoException(String message) {
		super(message);
	}
}
