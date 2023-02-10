package boletin3_Intr_Java;

import java.util.Scanner;



public class Ejercicio5 {

	public static void main(String[] args) {
		/*5. Diseña una función llamada esPalindromo que reciba una cadena de caracteres y
		determine si constituye un palíndromo o no. Una palabra es un palíndromo si puede
		leerse del mismo modo de izquierda a derecha que de derecha a izquierda. Obvia
		los espacios en blanco y caracteres separadores, así como tildes, etc.
		
		Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘Somos o no somos’.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena de caracteres y te diré si es palíndromo:");
		String cadena = String.valueOf(sc.nextLine());
		
		System.out.println(esPalindromo(cadena));

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

}
