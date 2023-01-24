package com.edu;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		/*11. Realiza un programa que pida números y muestre su cuadrado, repitiendo el
		proceso hasta que se introduzca un número negativo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num:");
		int num = Integer.valueOf(sc.nextLine());
		
		while(num >= 0) {
			double cuadrado = Math.pow(num, 2);
			System.out.println("El cuadrado de "+num+" es "+cuadrado);
			System.out.println("------------------------------");
			System.out.println("Num:");
			num = Integer.valueOf(sc.nextLine());
		}
		
	}

}
