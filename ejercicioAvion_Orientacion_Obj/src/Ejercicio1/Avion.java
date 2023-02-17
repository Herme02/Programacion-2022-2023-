package Ejercicio1;

public class Avion {

	//ATRIBUTOS
	
		private String idAvion;
		private Integer capacidad = 0;
		private Integer numVuelos = 0;
		private Double kmVolados = 0.0;
		private String compannia;
		
		
		public Avion(String idAvion, Integer capacidad) {
			super();
			this.idAvion = idAvion;
			this.capacidad = capacidad;
		}


		public Avion(String idAvion, Integer capacidad, String compannia) {
			super();
			this.idAvion = idAvion;
			this.capacidad = capacidad;
			this.compannia = compannia;
		}
		
		
		public boolean asignarVuelo(Integer capacidadViaje, Double kilometros) {
			boolean resultado = false;
			
			if((capacidad != null && capacidad >= capacidadViaje)||(capacidad == null)) {
				numVuelos++;
				kmVolados += kilometros;
				resultado = true;
			}
			
			return resultado;
		}
		
		
		public Integer getNumeroVuelos() {
			return numVuelos;
		}
		
		public Double getTotalKm() {
			return kmVolados;
		}
		
		public Double getMediaKm() {
			Double resultadoMedia = 0.0;
			
			if(numVuelos > 0) {
			resultadoMedia = getTotalKm() / getNumeroVuelos();
			}
			
			return resultadoMedia;
			
		}


		public String getIdAvion() {
			return idAvion;
		}


		public void setIdAvion(String idAvion) {
			this.idAvion = idAvion;
		}


		public Integer getCapacidad() {
			return capacidad;
		}


		public void setCapacidad(Integer capacidad) {
			this.capacidad = capacidad;
		}


		public Integer getNumVuelos() {
			return numVuelos;
		}


		public void setNumVuelos(Integer numVuelos) {
			this.numVuelos = numVuelos;
		}


		public Double getKmVolados() {
			return kmVolados;
		}


		public void setKmVolados(Double kmVolados) {
			this.kmVolados = kmVolados;
		}


		public String getCompannia() {
			return compannia;
		}


		public void setCompannia(String compannia) {
			this.compannia = compannia;
		}


		@Override
		public String toString() {
			return "Avion [idAvion=" + idAvion + ", capacidad=" + capacidad + ", numVuelos=" + numVuelos + ", kmVolados="
					+ kmVolados + ", compannia=" + compannia + "]";
		}
}
