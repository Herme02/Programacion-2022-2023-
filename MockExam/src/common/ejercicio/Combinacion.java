package common.ejercicio;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;


public abstract class Combinacion {

	private final int VALOR_MINIMO = 1;
	private final int VALOR_MAXIMO_NUMEROS = 50;
	private final int VALOR_MAXIMO_ESTRELLAS = 12;
	private final int TOTAL_NUMEROS = 5;
	private final int TOTAL_ESTRELLAS = 2;
	
	
	private Collection<Integer> numeros;
	private Collection<Integer> estrellas;
	
	
	public Combinacion(int[] listaNumeros, int[] listaEstrellas) throws CombinacionException{
		super();
		this.numeros = new HashSet<>();
		this.estrellas = new HashSet<>();
		
		for(int i : listaNumeros) {
			if(i < VALOR_MINIMO || i > VALOR_MAXIMO_NUMEROS) {
				throw new CombinacionException("El valor de un numero de sale de los parametros");
			}else {
				if(this.numeros.contains(i)) {
					throw new CombinacionException("No se pueden repetir numeros en la combinacion");
				}
				this.numeros.add(i);
			}
		}
		
		if(numeros.size() != TOTAL_NUMEROS) {
			throw new CombinacionException("No hay un total de 5 numeros dentro de esta loteria");
		}
		
		
		for(int j : listaEstrellas) {
			if(j < VALOR_MINIMO || j > VALOR_MAXIMO_ESTRELLAS) {
				throw new CombinacionException("El valor de un numero de sale de los parametros");
			}else {
				if(this.estrellas.contains(j)) {
					throw new CombinacionException("No se pueden repetir estrellas en la combinación");
				}
				
				this.estrellas.add(j);
			}
		}
		
		if(numeros.size() != TOTAL_ESTRELLAS) {
			throw new CombinacionException("No hay un total de 2 estrellas dentro de la loteria");
		}
	}


	public Collection<Integer> getNumeros() {
		return numeros;
	}


	public Collection<Integer> getEstrellas() {
		return estrellas;
	}
	
	
	public abstract int comprobarCombinacion(Combinacion c1);


	@Override
	public int hashCode() {
		return Objects.hash(numeros, estrellas);
	}


	@Override
	public boolean equals(Object obj) {

		return this==obj || obj!=null &&
	            obj instanceof Combinacion
	            && this.hashCode()==((Combinacion)obj).hashCode();
	}


	@Override
	public String toString() {
		return String.format("Combinacion: N= %s - E= %s", this.numeros,this.estrellas);
	}

	
	
	
	
}

