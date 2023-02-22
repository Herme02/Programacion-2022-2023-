package ejercicio2.model;

public class Cuenta {

	private Double saldo;
	private Integer numIngresos = 0;
	private Integer numReintegros = 0;
	
	
	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
		
	}


	public boolean totalIngresos(Double cantidadIngresar) {
		
		boolean verificacion = false;
		
		if(cantidadIngresar > 0) {
			saldo += cantidadIngresar;
			numIngresos++;
			verificacion = true;
		}else {
			throw new CuentaException("La cantidad a ingresar debe ser mayor que 0.");
		}
		
		return verificacion;
	}
	
	public boolean totalReintegros(Double cantidadReintegro) {
		
		boolean verificacion = false;
		
		if(cantidadReintegro > 0) {
			saldo -= cantidadReintegro;
			numReintegros++;
			verificacion = true;
		}else {
			throw new CuentaException("La cantidad a reintegrar debe ser mayor que 0.");
		}
		
		return verificacion;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Integer getNumIngresos() {
		return numIngresos;
	}


	public void setNumIngresos(Integer numIngresos) {
		this.numIngresos = numIngresos;
		
	}


	public Integer getNumReintegros() {
		return numReintegros;
	}


	public void setNumReintegros(Integer numReintegros) {
		this.numReintegros = numReintegros;
		
	}
}
