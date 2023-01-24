package com.edu;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		/*14. Realiza un programa que vaya pidiendo números hasta que se introduzca un
		número negativo y nos diga cuántos números se han introducido, la media de los
		impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
		final de la introducción de datos pero no se incluye en el cómputo.*/
		
		Scanner sc = new Scanner(System.in);
		
		int contNum = 0;
		int numParMayor = -1;
		int sumaMediaImpares = 0;
		int contImpares = 0;
		
		System.out.println("Num:");
		
		int num = Integer.valueOf(sc.nextLine());
		
		
		while(num >= 0) {
			contNum++;
			
			if(num % 2 == 0) {
				if(num > numParMayor) {
					numParMayor = num;
				}
			}else {
				contImpares++;
				sumaMediaImpares += num;
				
			}
			
			System.out.println("Num:");
			num = Integer.valueOf(sc.nextLine());
		}
		
		double mediaImpares = sumaMediaImpares / contImpares;
		
		System.out.println("--------------------------");
		System.out.println("Numeros introducidos:"+contNum);
		System.out.println("Media de los numeros impares:"+mediaImpares);
		System.out.println("Num mayor de los pares introducidos:"+numParMayor);
	}

}
