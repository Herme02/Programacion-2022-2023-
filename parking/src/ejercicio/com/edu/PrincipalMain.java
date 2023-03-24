package ejercicio.com.edu;

import java.time.LocalDateTime;

import ejercicio.model.Combustible;
import ejercicio.model.Parking;
import ejercicio.model.TipoVehiculo;
import ejercicio.model.Vehiculo;

public class PrincipalMain {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		Vehiculo v = new Vehiculo("Toyota","Golf 4","1111APQ",Combustible.GASOIL,TipoVehiculo.AUTOMOVIL);
		Vehiculo v1 = new Vehiculo("Seat","Area","2222AJG",Combustible.ELECTRICO,TipoVehiculo.TRANSPORTE_COLECTIVO);
		Vehiculo v2 = new Vehiculo("Ferrari","Bolf 5","3333BJG",Combustible.HIBRIDO,TipoVehiculo.CICLOMOTOR);

		Parking p = new Parking();
		System.out.println(p.entrarParking(v2));
		System.out.println(p.entrarParking(v));
		System.out.println(p.entrarParking(v1));
		System.out.println("Ordenar por fecha de entrada");
		System.out.println(p.compararPorFechaEntrada());	
		System.out.println("Ordenar por marca");
		System.out.println(p.compararPorMarca());
		System.out.println("Ordenar por modelo");
		System.out.println(p.compararPorModelo());
		System.out.println("Ordenar por tipo");
		System.out.println(p.compararPorTipo());
		System.out.println("Ordenar por combustible");
		System.out.println(p.compararPorCombustible());
		System.out.println("Ordenar por matricula");
		System.out.println(p.compararPorMatricula());
	}

}


