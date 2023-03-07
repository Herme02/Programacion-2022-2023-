package ejercicio3.model;

public class Jarra {

	private int capacidadJarra;
	private int litrosJarra = 0;
	private int totalAguaConsumida = 0;
	
	
	public Jarra(int capacidadJarra, int litrosJarra, int totalAguaConsumida) {
		super();
		this.capacidadJarra = capacidadJarra;
		this.litrosJarra = litrosJarra;
		this.totalAguaConsumida = totalAguaConsumida;
	}

	
	public void llenarJarra() {
		int litrosRestantes =capacidadJarra - litrosJarra;
		this.totalAguaConsumida += litrosRestantes;
		
		this.litrosJarra = capacidadJarra;
		
	}
	
	
	public void vaciarJarra() {
		this.litrosJarra = 0;
	}
	
	
	public void volcarJarra(Jarra j2) {
		if(this.litrosJarra > j2.capacidadJarra) {
			throw new JarraException("Los litros de la jarra a hechar no puede ser mayor que la capacidad de la otra jarra");
		}else {
			j2.capacidadJarra += this.litrosJarra;
			this.capacidadJarra = 0;
		}
	}
	
	

	@Override
	public String toString() {
		return "Jarra [capacidadJarra=" + capacidadJarra + ", litrosJarra=" + litrosJarra + "]";
	}


	public int getCapacidadJarra() {
		return capacidadJarra;
	}


	public void setCapacidadJarra(int capacidadJarra) {
		if(capacidadJarra > 0) {
		this.capacidadJarra = capacidadJarra;
		}else {
			throw new JarraException("LA capacidad de la jarra debe ser mayor que 0.");
		}
	}


	public int getLitrosJarra() {
		return litrosJarra;
	}


	public void setLitrosJarra(int litrosJarra) {
		this.litrosJarra = litrosJarra;
	}


	public int getTotalAguaConsumida() {
		return totalAguaConsumida;
	}


	public void setTotalAguaConsumida(int totalAguaConsumida) {
		this.totalAguaConsumida = totalAguaConsumida;
	}
	
	
	
	
}
