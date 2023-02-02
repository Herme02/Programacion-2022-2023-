package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
		devuelva el máximo común divisor según el algoritmo de Euclides.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num1:");
		int num1 = Integer.valueOf(sc.nextLine());
		
		while(num1 <= 0) {
			System.out.println("ERROR en numero debe ser mayor que 0,vulva a introducirlo:");
			num1 = Integer.valueOf(sc.nextLine());
		}
		
		System.out.println("Num2:");
		int num2 = Integer.valueOf(sc.nextLine());
		
		while(num2 <= 0) {
			System.out.println("ERROR en numero debe ser mayor que 0,vulva a introducirlo:");
			num2 = Integer.valueOf(sc.nextLine());
		}
		
		
		System.out.println(greaterCommonDivisor(num1, num2));

	}
	
	public static int greaterCommonDivisor(int num1, int num2) {
		
		while(num2 > 0) {
			int r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		
		return num1;
	}

}
