package com.edu;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		/*17. Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
		El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula
		sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,
		8, 13, 21, 34, 55, 89, 144.*/
		
		Scanner sc = new Scanner(System.in);
		
		int numFibonacci = 1;
		int numAnterior = 0;
		int numReserva = 0;
		
		System.out.println("Cuantos numeros de la serie de Fibonacci quieres que muestre:");
		int cantidad = Integer.valueOf(sc.nextLine());
		
		while(cantidad < 0) {
			System.out.println("ERROR al introducir la cantidad por favor vuelva a intentarlo");
			System.out.println("Cuantos numeros de la serie de Fibonacci quieres que muestre:");
			cantidad = Integer.valueOf(sc.nextLine());
		}
		
		for(int i = 0; i < cantidad; i++) {
			System.out.println(numFibonacci);
			numReserva = numFibonacci;
			numFibonacci += numAnterior;
			numAnterior = numReserva;
			
		}
	}

}
