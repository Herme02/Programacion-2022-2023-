package juego.model;

public class Baraja {

	private int numCartas = 47;
	private int siguiente = 0;
	private Carta carta;
	
	
	public Baraja() {
		super();
	}
	



	public void barajar() {
		this.siguiente = 0;
	}
	
	

	public Carta getSiguiente(Baraja b) {
		carta = new Carta(b.generaNumero(), b.generaPalo());
		this.carta = carta;
		this.siguiente+=1;
		return carta;
	}
	
	
	private String generaPalo() {
		String palo = "";
		int numPalo = (int) (Math.random()*4+1);
		
		if(numPalo == 1) {
			palo = "ESPADA";
		}else if(numPalo == 2) {
			palo = "COPA";
		}else if(numPalo == 3) {
			palo = "ORO";
		}else {
			palo = "BASTO";
		}
		
		return palo;
	}
	
	private int generaNumero() {
		
		int number = (int) (Math.random()*12+1);
		
		return number;
	}





	public int getNumCartas() {
		return numCartas;
	}





	public int getSiguiente() {
		return siguiente;
	}





	public Carta getCarta() {
		return carta;
	}




	@Override
	public String toString() {
		return String.format("Carta de la baraja numero %s, PALO: %s, NUMERO: %s", this.siguiente, this.carta.getPalo(), this.carta.getNumber());
	}
	
	
	
	
}
