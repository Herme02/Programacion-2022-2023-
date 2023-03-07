package ejercicio5.com.edu;

public class Equipo {

	private String nombreEquipo;
	private int partidosGanados = 0;
	
	
	
	
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		
		partidosGanados++;
		
		this.partidosGanados = partidosGanados;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
	}
	
	@Override
	public String toString() {
		return nombreEquipo;
	}

	
	
	
	
	
	
	
	
}
