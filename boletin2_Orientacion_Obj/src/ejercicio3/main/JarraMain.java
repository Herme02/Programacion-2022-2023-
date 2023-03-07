package ejercicio3.main;

import java.util.Scanner;

import ejercicio3.model.Jarra;

public class JarraMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Capacidad Jarra A:");
		int capacidadJarra = Integer.valueOf(sc.nextLine());
		
		Jarra j1 = new Jarra(capacidadJarra, capacidadJarra, capacidadJarra);
		
		
		System.out.println("Capacidad Jarra B:");
		capacidadJarra = Integer.valueOf(sc.nextLine());
		
		Jarra j2 = new Jarra(capacidadJarra, capacidadJarra, capacidadJarra);
		
		
		System.out.println("1. Llenar jarra \n"
				+ "2. Vaciar jarra \n"
				+ "3. Volcar jarra A en B \n"
				+ "4. Volcar jarra B en A \n"
				+ "5. Ver estado de las jarras \n"
				+ "6. Salir");
		
		
		System.out.println("Opcion:");
		int opcion = Integer.valueOf(sc.nextLine());
		
		while(opcion != 6) {
			if(opcion == 1) {
				System.out.println("Que jarra desea llenar A o B:");
				String opcion2 = String.valueOf(sc.nextLine());
				
				if(opcion2.equalsIgnoreCase("A")) {
					j1.llenarJarra();
				}else if(opcion2.equalsIgnoreCase("B")) {
					j2.llenarJarra();
				}else {
					System.out.println("ERROR al elegir una jarra , no se ha podido completar la acción");
				}
				
			}else if(opcion == 2) {
				System.out.println("Que jarra desea vaciar A o B:");
				String opcion2 = String.valueOf(sc.nextLine());
				
				if(opcion2.equalsIgnoreCase("A")) {
					j1.vaciarJarra();
				}else if(opcion2.equalsIgnoreCase("B")) {
					j2.vaciarJarra();;
				}else {
					System.out.println("ERROR al elegir una jarra , no se ha podido completar la acción");
				}
				
			}else if(opcion == 3) {
				j1.volcarJarra(j2);
				System.out.println("Vuelco realizado");
				
			}else if(opcion == 4) {
				j2.volcarJarra(j1);
				System.out.println("Vuelco realizado");
				
			}else if(opcion == 5) {
				System.out.println(j1.toString());
				System.out.println(j2.toString());
			}
			
			System.out.println("1. Llenar jarra \n"
					+ "2. Vaciar jarra \n"
					+ "3. Volcar jarra A en B \n"
					+ "4. Volcar jarra B en A \n"
					+ "5. Ver estado de las jarras \n"
					+ "6. Salir");
			
			
			System.out.println("Opcion:");
			opcion = Integer.valueOf(sc.nextLine());
		}
		
		int totalAguaConsumida = j1.getTotalAguaConsumida() + j2.getTotalAguaConsumida();
		
		System.out.println("El total de agua consumida a sido de "+totalAguaConsumida);
	}
	
	

}
