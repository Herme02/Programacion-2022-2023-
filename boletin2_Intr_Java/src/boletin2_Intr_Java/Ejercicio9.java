package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		/*9. Realiza un método llamado toDecimal que reciba un String con un valor numérico
		en binario como argumento y devuelva un número con el número decimal
		correspondiente.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un valor en binario para pasarlo a decimal:");
		String numBinario = String.valueOf(sc.nextLine());
		
		int numErrores = 0;
		
		for(int i = 0; i < numBinario.length();i++) {
			char caracter = numBinario.charAt(i);
			
			if(caracter != '1' && caracter != '0') {
				numErrores++;
			}
		}
		
		if(numErrores > 0) {
		System.out.println("ERROR al introducir el numero en binario");
		}
		else {
			System.out.println(toDecimal(numBinario));
		}
	}
	
	public static String toDecimal(String numBinario) {
		
		
		double resultado = 0;
		int cont = 0;
		
		for(int i = numBinario.length()-1; i >= 0; i--) {
			
			char caracter = numBinario.charAt(i);
			
			if(caracter == '1') {
				double elevado= Math.pow(2, cont);
				resultado += elevado;
			}
			cont++;
		}
		
		String resultadoFinal = String.valueOf(resultado);
		
		return resultadoFinal;
	}

	

}
