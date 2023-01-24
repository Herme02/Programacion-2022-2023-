package com.edu;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		/*12. Realiza un programa que pida números hasta que se teclee uno negativo y muestre
		cuántos números se han introducido.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num:");
		int num = Integer.valueOf(sc.nextLine());
		int cont = 1;
		
		while(num >= 0) {
			System.out.println("Num:");
			num = Integer.valueOf(sc.nextLine());
			cont++;
		}
		System.out.println("Num totales introducidos: " +cont);
	}

}
