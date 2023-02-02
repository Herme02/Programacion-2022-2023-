package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*8. Realiza un método llamado toBinary que reciba un número decimal como
		argumento y devuelva un String con el número binario correspondiente.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un numero en Decimal:");
		int numDecimal = Integer.valueOf(sc.nextLine());
		
		System.out.println(toBinary(numDecimal));
	}
	
	public static String toBinary(int numDecimal) {
		
		String resulBinarioInv = "";
		String resulBinario = "";
		
		while(numDecimal > 0) {
			if(numDecimal % 2 == 0) {
				resulBinarioInv += "0";
			}else {
				resulBinarioInv += "1";
			}
			numDecimal /= 2;
		}
		
		for(int i = resulBinarioInv.length()-1; i >= 0; i--) {
			char numero = resulBinarioInv.charAt(i);
			
			resulBinario += numero;
		}
		
		return resulBinario;
	}

}
