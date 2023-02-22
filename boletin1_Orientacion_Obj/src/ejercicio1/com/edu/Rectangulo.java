package ejercicio1.com.edu;

public class Rectangulo {

	//ATRIBUTOS
	private Double longitud = 1.0;
	private Double ancho = 1.0;
	
	
	//METODOS
	
	public Rectangulo(Double longitud, Double ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}
	
	
	public Double calcularPerimetro() {
		
		Double resultado = 0.0;
		
		resultado = (longitud * 2)+(ancho * 2);
		
		return resultado;
	}


	public Double calcularArea() {
		
		Double resultado = 0.0;
		
		resultado = longitud * ancho;
		
		return resultado;
	}

	
	
	//SETTERS Y GETTERS
	
	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) throws Exception {
		
		if(longitud < 0 || longitud > 20) {
			throw new RectanguloException("ERROR al insertar la longitud");
			
		}else {
			this.longitud = longitud;
		}
		
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) throws RectanguloException {
		
		if(ancho < 0 || ancho > 20) {
			throw new RectanguloException("ERROR al insertar el ancho");
		}else {
		this.ancho = ancho;
		}
	}
	
}
