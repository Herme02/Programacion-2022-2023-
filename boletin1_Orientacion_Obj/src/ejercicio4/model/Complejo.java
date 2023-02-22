package ejercicio4.model;

public class Complejo {

	private Double real1;
	private Double imaginario1;
	private Double real2;
	private Double imaginario2;
	
	
	
	public Complejo(Double real1, Double imaginario1, Double real2, Double imaginario2) {
		super();
		this.real1 = real1;
		this.imaginario1 = imaginario1;
		this.real2 = real2;
		this.imaginario2 = imaginario2;
	}
	
	
	
	public String sumarComplejos() {
		
		Double a = real1 + real2;
		Double b = imaginario1 + imaginario2;
		
		return a+" + "+b+"i";
	}
	
	
	
	public String restarComplejos() {
		
		
		
		Double a = real1 + (real2 * -1);
		Double b = imaginario1 + (imaginario2 * -1);
		
		return a+" + "+b+"i";
	}
	
	
	public boolean equalsComplejos(String a, String b) {
		boolean validacion = false;
		
		if(a.equals(b)) {
			validacion = true;
		}
		
		return validacion;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Complejo1 [real=" + real1 + ", imaginario=" + imaginario1 + "]\n"
				+ "Complejo2 [real=" + real2 + ", imaginario=" + imaginario2 + "]";
	}



	public Double getReal1() {
		return real1;
	}



	public void setReal1(Double real1) {
		this.real1 = real1;
	}



	public Double getImaginario1() {
		return imaginario1;
	}



	public void setImaginario1(Double imaginario1) {
		this.imaginario1 = imaginario1;
	}



	public Double getReal2() {
		return real2;
	}



	public void setReal2(Double real2) {
		this.real2 = real2;
	}



	public Double getImaginario2() {
		return imaginario2;
	}



	public void setImaginario2(Double imaginario2) {
		this.imaginario2 = imaginario2;
	}
	
}
