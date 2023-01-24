package com.edu;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		/*18. Realizar un método llamado calcularAreaCirculo que devuelva el área de un círculo
		y otro llamado calcularLongitudCirculo que devuelva su longitud.*/
		
		System.out.println(calcularAreaCirculo());
		
		System.out.println(calcularLongitudCirculo());
	
	}
	
	
	
	public static final double PI = 3.14;
	
	public static double calcularAreaCirculo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Radio:");
		int radio = Integer.valueOf(sc.nextLine());
		
		double calculoRadio = PI * Math.pow(radio, 2);
		
		return calculoRadio;
		
	}
	
	public static double calcularLongitudCirculo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Radio:");
		int radio = Integer.valueOf(sc.nextLine());
		
		double calcularLongitud = 2 * PI * radio;
		
		return calcularLongitud;
	}

}
