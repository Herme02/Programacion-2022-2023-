package boletin2_Intr_Java;

import java.util.Scanner;

import boletin2_Intr_Java.Ejercicio10;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*11. Realizar un método llamado minimoComunMultiplo que reciba dos números y
		calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
		una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
		dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
		números dividido entre su máximo común divisor. Por ejemplo, el máximo común
		divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
		(24×36)/12=72.*/
		
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
		
		System.out.println(minimoComunMultiplo(num1, num2));

	}
	
	public static int greaterCommonDivisor(int num1, int num2) {
		
		while(num2 > 0) {
			int r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		
		return num1;
	}
	
	
	public static int minimoComunMultiplo(int num1, int num2) {
		
		int resultado = (num1 * num2) / greaterCommonDivisor(num1, num2);
		
		return resultado;
	}

}
