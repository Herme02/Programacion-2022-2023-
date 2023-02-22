package ejercicio3.model;

public class Maquina {

	public final Double PRECIO_CAFE = 1.0;
	public final Double PRECIO_LECHE = 0.8;
	public final Double PRECIO_CAFE_CON_LECHE = 1.5;
	
	//ATRIBUTOS
	
	private Integer capacidadCafe = 1;
	private Integer capacidadLeche = 1;
	private Integer capacidadVasos = 1;
	private Double monederoMaquina;
	
	
	public Maquina(Double monederoMaquina) {
		super();
		this.monederoMaquina = monederoMaquina;
	}
	
	
	public String llenarDepositos() {
		capacidadCafe = 50;
		capacidadLeche = 50;
		capacidadVasos = 80;
		
		return "Depositos de la máquina rellenados con exito";
	}


	@Override
	public String toString() {
		return "Maquina [capacidadCafe=" + capacidadCafe + ", capacidadLeche=" + capacidadLeche + ", capacidadVasos="
				+ capacidadVasos + ", monederoMaquina=" + monederoMaquina + "]";
	}
	
	
	public String vaciarMonedero() {
		
		
		
		return"Aqui tiene su cambio, que tenga un bune dia";
	}
	
	
	public String servirBebida(Integer opcionServir, Double introducirDinero) {
		
		String conclusion = "";
		if(opcionServir == 1) {
			if(introducirDinero < PRECIO_CAFE || capacidadCafe <= 0 || capacidadVasos <= 0) {
				throw new MaquinaException("ERROR al servir cafe.");
			}else {
				introducirDinero -= PRECIO_CAFE;
				monederoMaquina += PRECIO_CAFE;
				capacidadCafe -= 1;
				capacidadVasos -= 1;
				conclusion = "Producto servido";
			}
		}else if(opcionServir == 2) {
			if(introducirDinero < PRECIO_LECHE || capacidadLeche <= 0 || capacidadVasos <= 0) {
				throw new MaquinaException("ERROR al servir la leche");
			}else {
				introducirDinero -= PRECIO_LECHE;
				monederoMaquina += PRECIO_LECHE;
				capacidadLeche -= 1;
				capacidadVasos -= 1;
				conclusion = "Producto servido";
			}
		}else if(opcionServir == 3) {
			if(introducirDinero < PRECIO_CAFE_CON_LECHE || capacidadCafe <= 0 || capacidadLeche <= 0 || capacidadVasos <= 0) {
				throw new MaquinaException("ERROR al servir el cafe con leche");
			}else {
				introducirDinero -= PRECIO_CAFE_CON_LECHE;
				monederoMaquina += PRECIO_CAFE_CON_LECHE;
				capacidadCafe -= 1;
				capacidadLeche -= 1;
				capacidadVasos -= 1;
				conclusion = "Producto servido";
			}
		}else {
			throw new MaquinaException("ERROR al introducir el tipo de bebida");
		}
		System.out.println("Recoge tu cambio de "+introducirDinero+ "euros.");
		
		return conclusion;
	}


	public Integer getCapacidadCafe() {
		return capacidadCafe;
	}


	public void setCapacidadCafe(Integer capacidadCafe) {
		this.capacidadCafe = capacidadCafe;
	}


	public Integer getCapacidadLeche() {
		return capacidadLeche;
	}


	public void setCapacidadLeche(Integer capacidadLeche) {
		this.capacidadLeche = capacidadLeche;
	}


	public Integer getCapacidadVasos() {
		return capacidadVasos;
	}


	public void setCapacidadVasos(Integer capacidadVasos) {
		this.capacidadVasos = capacidadVasos;
	}


	public Double getMonederoMaquina() {
		return monederoMaquina;
	}


	public void setMonederoMaquina(Double monederoMaquina) {
		this.monederoMaquina = monederoMaquina;
	}
}
