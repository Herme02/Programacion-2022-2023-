package juego.model;

import java.util.Objects;

public class Carta {

	private int number;
	private String palo;
	
	
	
	public Carta(int number, String palo) {
		super();
		this.number = number;
		this.palo = palo;
	}

	
	public double getValor() {
		double valorCarta = 0;
		
		if(this.number >= 8) {
			valorCarta = 0.5;
		}else {
			valorCarta = this.number;
		}
		
		return valorCarta;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Carta) {
			Carta casteado = (Carta)obj;
			sonIguales = Objects.equals(casteado.number, this.number);
		}
		
		return sonIguales;
	}


	public int getNumber() {
		return number;
	}



	public String getPalo() {
		return palo;
	}


	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}
	
	
	
	
	
	
}
