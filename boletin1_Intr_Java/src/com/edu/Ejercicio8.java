package com.edu;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*8. Método que pida 15 números y realice su suma.*/
		Scanner sc = new Scanner(System.in);
		
		int sumaTotal = 0;
		
		for(int cont = 0; cont < 15;cont++) {
			System.out.println("Dime un numero:");
			int num = Integer.valueOf(sc.nextLine());
			
			sumaTotal += num;
		}
		
		System.out.println(sumaTotal);
	}

}
