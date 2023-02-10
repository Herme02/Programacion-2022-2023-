package boletin3_Intr_Java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*6. Haciendo uso de la función anterior crea una función esCapicúa que acepte
		números tanto enteros como decimales.*/
		
		Scanner sc = new Scanner(System.in);
		
		
		String cadena = "";
		
		
		System.out.println(esCapicua(cadena));
	}
	
	public static boolean esPalindromo(String cadena) {
		boolean validacion = true;
		String cadenaLimpia = "";
		
		for(int j = 0; j < cadena.length(); j++) {
			char caracter = cadena.charAt(j);
			
			if(caracter != ' ' && caracter != '.') {
				cadenaLimpia += caracter;
			}
		}
		
		
		
		for(int i = 0; i < Math.round(cadenaLimpia.length()/2); i++) {
			char caracterIzquierda = cadenaLimpia.charAt(i);
			char caracterDerecha = cadenaLimpia.charAt(cadenaLimpia.length()-1-i);
			
			if(caracterIzquierda != caracterDerecha) {
				validacion = false;
			}
		}
		
		return validacion;
	}
	
	public static boolean esCapicua(String cadena) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean resultado;
		double numDecimal = 0.0;
		int numEntero = 0;
		
		
		System.out.println("Insertaras un numero entero o demimal(E/D)?");
		String opcion = String.valueOf(sc.nextLine());
		
		if(opcion.equals("D")) {
		System.out.println("Inserte un numero y le diremos si es Capicua:");
		numDecimal = Double.valueOf(sc.nextLine());
		cadena += numDecimal;
		}else if(opcion.equals("E")){
			System.out.println("Inserte un numero y le diremos si es Capicua:");
			numEntero = Integer.valueOf(sc.nextLine());
			cadena += numEntero;
		}
			
		resultado = esPalindromo(cadena);
		
		
		
		return resultado;
	}

}
