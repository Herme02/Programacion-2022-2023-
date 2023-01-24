package com.edu;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		/*15. Crea un programa que permita sumar N números. El usuario decide cuándo termina
		de introducir números al indicar la palabra ‘fin’.*/
		
		Scanner sc = new Scanner(System.in);
		
		int sumaTotal = 0;
		
		
		System.out.println("Quieres emprezar introduciendo numeros?");
		String opcion = String.valueOf(sc.nextLine());
		
		while(!opcion.equals("fin")) {
			System.out.println("Introduce un numero:");
			Integer num = Integer.valueOf(sc.nextLine());
			
			sumaTotal += num;
			
			System.out.println("Quieres seguir introduciendo numeros?");
			opcion = String.valueOf(sc.nextLine());
		}
		
		System.out.println("La suma total de todos los numeros a sido de "+sumaTotal);
		
	}

}
