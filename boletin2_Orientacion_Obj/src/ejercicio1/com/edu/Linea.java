package ejercicio1.com.edu;

import java.util.Objects;

public class Linea{

	Punto puntoA;
	Punto puntoB;
	
	
	
	
	public Linea() {
		super();
		this.puntoA = new Punto(0.0,0.0);
		this.puntoB = new Punto(0.0,0.0);
	}



	public Linea(Punto puntoA, Punto puntoB) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public boolean equals(Object obj) {
		
		boolean sonIguales = this == obj;
		
		if(!sonIguales && obj != null && obj instanceof Linea) {
			
			Linea l1 = (Linea)obj;
			
			sonIguales = l1.puntoA == this.puntoA && l1.puntoB == this.puntoB;
		}
		
		return sonIguales;
	}
	
	
	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}



	public void moverDerecha(Double cantidad) {
		this.puntoA.moverDerecha(cantidad);
	}
	
	public void moverIzquierda(Double cantidad) {
		this.puntoA.moverIzquierda(cantidad);
	}
	
	public void moverArriba(Double cantidad) {
		this.puntoB.moverArriba(cantidad);
	}
	
	public void moverAbajo(Double cantidad) {
		this.puntoB.moverAbajo(cantidad);
	}


	

	



	




	
	
	
}
