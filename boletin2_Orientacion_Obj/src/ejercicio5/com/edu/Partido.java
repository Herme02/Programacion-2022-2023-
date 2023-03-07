package ejercicio5.com.edu;

public class Partido {

	private int jornada = 1;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int numGolesLocal = 0;
	private int numGolesVisitante = 0;
	private String quiniela;
	private int aciertosQuiniela;
	private int contadorQuiniela;
	
	
	public Partido() {
		super();
	}
	
	
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante, int numGolesLocal, int numGolesVisitante, String quiniela) {
		super();
		this.jornada = jornada;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.numGolesLocal = numGolesLocal;
		this.numGolesVisitante = numGolesVisitante;
		this.quiniela = quiniela;
	}
	
	public void ponerResultado(String resultado, Equipo e1, Equipo e2) {
		
		if(e1.getNombreEquipo().equalsIgnoreCase(e2.getNombreEquipo())) {
			throw new PartidoException("No pueden jugar dos equipos iguales");
		}else {
		
		char caracterLocal = resultado.charAt(0);
		char caracterVisitante = resultado.charAt(2);
		
		this.numGolesLocal = Character.getNumericValue(caracterLocal);
		this.numGolesVisitante = Character.getNumericValue(caracterVisitante);
		
		if((caracterLocal > caracterVisitante && this.quiniela.equals("1")) || (caracterLocal < caracterVisitante && this.quiniela.equals("2")) || (caracterLocal == caracterVisitante && this.quiniela.equalsIgnoreCase("X"))) {
			this.aciertosQuiniela++;
		}
		
		this.contadorQuiniela++;
		
		if(caracterLocal > caracterVisitante) {
			if(equipoLocal.equals(e1.getNombreEquipo())) {
				e1.getPartidosGanados();
			}else if(equipoLocal.equals(e2.getNombreEquipo())) {
				e2.getPartidosGanados();
			}
		}
		
		this.jornada++;
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Elpartido entre el equipo Local " + equipoLocal + ", y el equipo Visitante " + equipoVisitante + ", a finalizado con "
				+ numGolesLocal + " goles del equipo local y " + numGolesVisitante + " goles del equipo visitante. Resultado quiniela=" + aciertosQuiniela
				+ "/" + contadorQuiniela;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public int getNumGolesLocal() {
		return numGolesLocal;
	}

	public void setNumGolesLocal(int numGolesLocal) {
		numGolesLocal = (int) Math.random()*10;
		
		this.numGolesLocal = numGolesLocal;
	}

	public int getNumGolesVisitante() {
		return numGolesVisitante;
	}

	public void setNumGolesVisitante(int numGolesVisitante) {
		numGolesVisitante = (int) Math.random()*10;
		
		this.numGolesVisitante = numGolesVisitante;
	}

	public String getQuiniela() {
		return quiniela;
	}

	public void setQuiniela(String quiniela) {
		
		if(!this.quiniela.equalsIgnoreCase("1") && !this.quiniela.equalsIgnoreCase("X") &&!this.quiniela.equalsIgnoreCase("2")) {
			throw new PartidoException("Caracter de la quiniela incorrecto");
		}
		
		this.quiniela = quiniela;
	}
	
	
	
}
