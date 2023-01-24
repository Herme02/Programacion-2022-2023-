package com.edu;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		/*1. Diseña un programa que pregunte por la edad de una persona e imprima
		si es mayor de edad.
		2. Modifica el programa anterior para que indique el grupo de edad al que
		pertenece (niñ@ < 18, adulto, ancian@ > 65).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos años tienes:");
		int edad = sc.nextInt();
		
		if(edad > 0 && edad < 18) {
			System.out.println("Eres menor de edad");
		}else if(edad >= 18 && edad <= 65) {
			System.out.println("Eres un adulto");
		}else if(edad > 65) {
			System.out.println("Eres un anciano");
		}
		
		

	}

}
