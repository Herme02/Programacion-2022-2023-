package com.edu;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		/*13. Programa que reciba 10 números y nos indique el valor máximo y mínimo.*/
		
		Scanner sc = new Scanner(System.in);
		
		int valorMin = 100000;
		int valorMax = -100000;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Num:");
			int num = Integer.valueOf(sc.nextLine());
			
			if(num < valorMin) {
				valorMin = num;
			}
			
			if(num > valorMax) {
				valorMax = num;
			}
			
		}
		System.out.println("----------------");
		System.out.println("Valor minimo:"+valorMin);
		System.out.println("Valor maximo:"+valorMax);
	}

}
