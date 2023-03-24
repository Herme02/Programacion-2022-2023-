package ejercicio.comparables;

import java.util.Comparator;

import ejercicio.model.Vehiculo;

public class CompararPorModelo implements Comparator<Vehiculo> {

	public CompararPorModelo() {
	}

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		if(o1 != null && o2 != null) {
			resultado = o1.getModelo().compareTo(o2.getModelo());
		}else if(o2 == null) {
			resultado = -1;
		}else if(o1 == null) {
			resultado = 1;
		}
		return resultado;
	}

}