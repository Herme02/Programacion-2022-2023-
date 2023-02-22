package ejercicio3.com.edu;

import java.util.Scanner;

import ejercicio3.model.Maquina;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("La maquina dispone de un monedero de:");
		Double monederoMaquina = Double.valueOf(sc.nextLine());
		
		while(monederoMaquina < 5) {
			System.out.println("La maquina tiene muy poco dinero, por favor incremente la cantidad");
			monederoMaquina = Double.valueOf(sc.nextLine());
		}
		
		Maquina m1 = new Maquina(monederoMaquina);
		
		System.out.println("Bienvenido, por favor elija una opcion");
		System.out.println("---------------------------------------");
		
		System.out.println("1. Servir café solo(1 euro)");
		System.out.println("2. Servir leche(0.8 euros)");
		System.out.println("3. Servir café con leche(1.5 euros)");
		System.out.println("4. Consultar estado máquina. Aparecen los datos de los depositos y del monedero");
		System.out.println("5. Apagar máquina y salir.");
		
		System.out.println("---------------------------------------");

		System.out.println("Opcion:");
		Integer opcion = Integer.valueOf(sc.nextLine());
		
		System.out.println("Por favor, inserte el dinero para poder realizar la transaccion, cuanto va a insertar:");
		Double introducirDinero = Double.valueOf(sc.nextLine());
		
		while(opcion != 5) {
			
			Integer opcionServir = opcion;
			
			
			if(opcion == 1) {
				System.out.println(m1.servirBebida(opcionServir, introducirDinero));
			}else if(opcion == 2) {
				System.out.println(m1.servirBebida(opcionServir, introducirDinero));
			}else if(opcion == 3) {
				System.out.println(m1.servirBebida(opcionServir, introducirDinero));
			}else if(opcion == 4) {
				System.out.println(m1.toString());
			}
			
			if(m1.getCapacidadCafe() <= 0 || m1.getCapacidadLeche() <= 0 || m1.getCapacidadVasos() <= 0) {
				System.out.println(m1.llenarDepositos());
			}
			
			
			System.out.println("---------------------------------------");
			
			System.out.println("1. Servir café solo(1 euro)");
			System.out.println("2. Servir leche(0.8 euros)");
			System.out.println("3. Servir café con leche(1.5 euros)");
			System.out.println("4. Consultar estado máquina. Aparecen los datos de los depositos y del monedero");
			System.out.println("5. Apagar máquina y salir.");
			
			System.out.println("---------------------------------------");

			System.out.println("Opcion:");
			opcion = Integer.valueOf(sc.nextLine());
			
		}
		
		System.out.println(m1.vaciarMonedero());
	}

}
