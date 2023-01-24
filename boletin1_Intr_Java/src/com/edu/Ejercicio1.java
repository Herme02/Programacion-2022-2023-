package com.edu;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*1. Realiza un método que reciba dos números y devuelva True si uno es múltiplo del
		otro.*/
		
		Scanner sc = new Scanner(System.in);
		
		boolean resultado = false;
		
		System.out.println("Num1:");
		int num1 = sc.nextInt();
		
		System.out.println("Nume2:");
		int num2 = sc.nextInt();
		
		if((num1 % num2 == 0) || (num2 % num1 == 0)) {
			resultado = true;
		}
		
		System.out.println(resultado);

	}

}
