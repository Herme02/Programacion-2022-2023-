package com.edu;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/*10. Realiza un programa que sume los 100 números siguientes a un número entero y
		positivo introducido por teclado. Se debe comprobar que el dato introducido es
		correcto (que es un número positivo).*/
		
		Scanner sc = new Scanner(System.in);
		
		int sumaTotal = 0;
		
		
		System.out.println("Dime un numero y te dire la suma de los 100 siguientes");
		int num = Integer.valueOf(sc.nextLine());
		
		while(num < 0) {
			System.out.println("ERROR, el numero debe ser positivo, vuelva a introducirlo");
			num =Integer.valueOf(sc.nextLine());
		}
		
		for(int cont = 1; cont <= 100; cont++) {
			sumaTotal += num;
			num++;
		}
		
		System.out.println("El total de la suma de sus 100 siguientes numeros da "+sumaTotal);
		
	}

}
