package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*5. Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si
		el primer número es múltiplo del segundo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num1:");
		int num1 = Integer.valueOf(sc.nextLine());
		
		System.out.println("Num2:");
		int num2 = Integer.valueOf(sc.nextLine());
		
		System.out.println(esMultiplo(num1, num2));
	}
	
	public static boolean esMultiplo(int num1, int num2) {
		boolean validacion = false;
		
		if(num1 % num2 == 0) {
			validacion = true;
		}
		
		return validacion;
	}

}
