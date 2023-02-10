package boletin3_Intr_Java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*1. Escribe una función que reciba una cadena de texto y una variable bandera
		(par/impar) e imprima solo los caracteres que se encuentran situados en las
		posiciones pares o impares (según indique la variable bandera).
		Desarrolla el código con un bucle for y después modifica el código para que utilice
		una estructura while y do-while.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto:");
		String cadena =  String.valueOf(sc.nextLine());
		
		System.out.println("Bandera:");
		String bandera = String.valueOf(sc.nextLine());
		
		System.out.println(parImparDoWhile(cadena, bandera));
	}
	
	public static String parImparFor(String cadena, String bandera) {
		
		String cadenaResultado = "";
		
		for(int i = 0; i < cadena.length();i++) {
			char caracter = cadena.charAt(i);
			
			if(bandera.equals("par")) {
				if(i % 2 == 0) {
					cadenaResultado += caracter;
				}
			}else if(bandera.equals("impar")) {
				if(i % 2 != 0) {
					cadenaResultado += caracter;
				}
			}
		}
		
		return cadenaResultado;
	}
	
	public static String parImparWhile(String cadena, String bandera) {
	
		String cadenaResultado = "";
		int i = 0;

		while(i < cadena.length()) {
			char caracter = cadena.charAt(i);
			
			if(bandera.equals("par")) {
				if(i % 2 == 0) {
					cadenaResultado += caracter;
				}
			}else if(bandera.equals("impar")) {
				if(i % 2 != 0) {
					cadenaResultado += caracter;
				}
			}
			i++;
		}
		
		return cadenaResultado;
	}

	public static String parImparDoWhile(String cadena, String bandera) {
		String cadenaResultado = "";
		int i = 0;
		
		do {
			char caracter = cadena.charAt(i);
			
			if(bandera.equals("par")) {
				if(i % 2 == 0) {
					cadenaResultado += caracter;
				}
			}else if(bandera.equals("impar")) {
				if(i % 2 != 0) {
					cadenaResultado += caracter;
				}
			}
			i++;
		}while(i < cadena.length());
		
		return cadenaResultado;
	}
	
}
