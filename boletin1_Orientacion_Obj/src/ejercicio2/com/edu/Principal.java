package ejercicio2.com.edu;

import java.util.Scanner;

import ejercicio2.model.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saldo en la cuenta:");
		Double saldo = Double.valueOf(sc.nextLine());
		
		
		Cuenta c1 = new Cuenta(saldo);
		
		
		Integer opcion = 0;
		
		while(opcion != 4) {
			System.out.println("-----------------------");
			System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.");
			System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.");
			System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
			System.out.println("4. Finalizar las operaciones. Debe confirmar si realmente desea salir e\n"
					+ "informar del saldo al final de todas las operaciones.");
			System.out.println("-----------------------");

			System.out.println("POR FAVOR ELIJA UNA OPCION:");
			opcion = Integer.valueOf(sc.nextLine());
			
			if(opcion == 1) {
				System.out.println("Cantidad a reintegrar:");
				Double cantidadReintegrar = Double.valueOf(sc.nextLine());
				
				System.out.println(c1.totalReintegros(cantidadReintegrar));
				
			}else if(opcion == 2) {
				System.out.println("Cantidad a integrar:");
				Double cantidadIntegrar = Double.valueOf(sc.nextLine());
				
				System.out.println(c1.totalIngresos(cantidadIntegrar));
			}else if(opcion == 3) {
				System.out.println("Saldo:" + c1.getSaldo());
				System.out.println("Reintegros:" + c1.getNumReintegros());
				System.out.println("Ingresos:" + c1.getNumIngresos());
			}
			
			
			if(opcion == 4) {
				System.out.println("¿Realmente desea salir?(S/N)");
				String opcion2 = String.valueOf(sc.nextLine());
				
				if(opcion2.equalsIgnoreCase("N")) {
					System.out.println("-----------------------");
					System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.");
					System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.");
					System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
					System.out.println("4. Finalizar las operaciones. Debe confirmar si realmente desea salir e\n"
							+ "informar del saldo al final de todas las operaciones.");
					System.out.println("-----------------------");

					System.out.println("POR FAVOR ELIJA UNA OPCION:");
					opcion = Integer.valueOf(sc.nextLine());
				}
			}
		}

	}

}
