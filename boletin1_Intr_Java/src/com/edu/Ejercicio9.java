package com.edu;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*9. Método que pida 5 números e imprima si alguno es múltiplo de 3.*/
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		while(cont < 5) {
			System.out.println("Dime un numero:");
			int num = Integer.valueOf(sc.nextLine());
			
			if(num % 3 == 0) {
				System.out.println("Este numero es multiplo de 3");
			}
			
			cont++;
		}

	}

}
