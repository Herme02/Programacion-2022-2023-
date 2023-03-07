package ejercicio1.com.edu;

public class Punto {

	private Double x;
	private Double y;
	
	
	
	
	public Punto(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}





	public Double getX() {
		return x;
	}




	public void setX(Double x) {
		this.x = x;
	}




	public Double getY() {
		return y;
	}




	public void setY(Double y) {
		this.y = y;
	}
	
	
	public void moverDerecha(Double cantidad) {
		x += cantidad;
	}
	
	
	public void moverIzquierda(Double cantidad) {
		x -= cantidad;
	}
	
	public void moverArriba(Double cantidad) {
		y += cantidad;
	}
	
	public void moverAbajo(Double cantidad) {
		y -= cantidad;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
