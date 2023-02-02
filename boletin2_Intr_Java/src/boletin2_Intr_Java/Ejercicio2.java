package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. Realiza un programa que pida un número por teclado y que después muestre ese
		número al revés*/
		
		String numInvertido = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero:");
		String num = String.valueOf(sc.nextLine());
		
		for(int i = num.length()-1; i >= 0; i--) {
			numInvertido += num.charAt(i);
		}
		
		System.out.println(numInvertido);

	}

}
