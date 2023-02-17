package Ejercicio1;

import java.util.Scanner;

public class AvionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("1. Crear avión solo con el identificador.");
		System.out.println("2. Crear avion con el identificador y la compañia");
		System.out.println("------------------------");
		
		Integer opcion = Integer.valueOf(sc.nextLine());
		
		
		if(opcion == 1) {
			
			System.out.println("IdAvion:");
			String idAvion = String.valueOf(sc.nextLine());
			
			
			Avion v1 = new Avion(idAvion, null);
			
			System.out.println("a)Asignar Vuelo:");
			System.out.println("b)Obtener el numero de vuelos");
			System.out.println("c)Obtener el numero de kilometros");
			System.out.println("d)Obtener la media de kilómetros por vuelo");
			System.out.println("e)Cambio de compañia");
			System.out.println("f)Mostrar informacion del avión");
			System.out.println("g)Salir");
			
			String opcion2 = String.valueOf(sc.nextLine());
			
			while(!opcion2.equals("g")) {
				
				if(opcion2.equals("a")) {
					System.out.println("Capacidad:");
					Integer capacidadViaje = Integer.valueOf(sc.nextLine());
					System.out.println("Kilometros:");
					Double kilometros = Double.valueOf(sc.nextLine());
					
					System.out.println(v1.asignarVuelo(capacidadViaje, kilometros));
				}
				
				if(opcion2.equals("b")) {
					System.out.println("Numero de vuelos:"+v1.getNumeroVuelos());
				}else if(opcion2.equals("c")) {
					System.out.println("Numero de kilometros volados:"+v1.getKmVolados());
				}else if(opcion2.equals("d")) {
					System.out.println("Media de kilometros por vuelos:"+v1.getMediaKm());
				}else if(opcion2.equals("e")) {
					System.out.println("Compañia:"+v1.getCompannia());
				}else if(opcion2.equals("f")) {
					System.out.println(v1.toString());
				}
				
				System.out.println("a)Asignar Vuelo:");
				System.out.println("b)Obtener el numero de vuelos");
				System.out.println("c)Obtener el numero de kilometros");
				System.out.println("d)Obtener la media de kilómetros por vuelo");
				System.out.println("e)Cambio de compañia");
				System.out.println("f)Mostrar informacion del avión");
				System.out.println("g)Salir");
				
				opcion2 = String.valueOf(sc.nextLine());
			}
			
		}else if(opcion == 2) {
			
			System.out.println("IdAvion:");
			String idAvion = String.valueOf(sc.nextLine());
			
			System.out.println("Compañia:");
			String compannia = String.valueOf(sc.nextLine());
			
			Avion v2 = new Avion(idAvion, null, compannia);
			
			System.out.println("a)Asignar Vuelo:");
			System.out.println("b)Obtener el numero de vuelos");
			System.out.println("c)Obtener el numero de kilometros");
			System.out.println("d)Obtener la media de kilómetros por vuelo");
			System.out.println("e)Cambio de compañia");
			System.out.println("f)Mostrar informacion del avión");
			System.out.println("g)Salir");
			
			String opcion2 = String.valueOf(sc.nextLine());
			
			while(!opcion2.equals("g")) {
				
				if(opcion2.equals("a")) {
					System.out.println("Capacidad:");
					Integer capacidadViaje = Integer.valueOf(sc.nextLine());
					System.out.println("Kilometros:");
					Double kilometros = Double.valueOf(sc.nextLine());
					
					System.out.println(v2.asignarVuelo(capacidadViaje, kilometros));
				}
				
				if(opcion2.equals("b")) {
					System.out.println("Numero de vuelos:"+v2.getNumeroVuelos());
				}else if(opcion2.equals("c")) {
					System.out.println("Numero de kilometros volados:"+v2.getKmVolados());
				}else if(opcion2.equals("d")) {
					System.out.println("Media de kilometros por vuelos:"+v2.getMediaKm());
				}else if(opcion2.equals("e")) {
					System.out.println("Compañia:"+v2.getCompannia());
				}else if(opcion2.equals("f")) {
					System.out.println(v2.toString());
				}
				
				System.out.println("a)Asignar Vuelo:");
				System.out.println("b)Obtener el numero de vuelos");
				System.out.println("c)Obtener el numero de kilometros");
				System.out.println("d)Obtener la media de kilómetros por vuelo");
				System.out.println("e)Cambio de compañia");
				System.out.println("f)Mostrar informacion del avión");
				System.out.println("g)Salir");
				
				opcion2 = String.valueOf(sc.nextLine());
		}
	}
	}

}
