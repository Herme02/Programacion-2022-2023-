package boletin3_Intr_Java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. El cifrado César es un tipo de cifrado por sustitución en el que una letra del alfabeto
		es sustituida por otra que se encuentra situada en el abecedario
		(abcdefghijklmnñopqrstuvwxyz) un número dado de posiciones desde la primera,
		como puede observarse en la siguiente imagen:
		Así, por ejemplo, la palabra CASADO, con un cifrado de tres posiciones pasaría a
		ser FDVDGR.
		a. Realiza una función que cifre un carácter según el cifrado César y un
		desplazamiento dado.
		b. Elabora una función que, haciendo uso de la anterior, reciba una palabra y un
		número fijo de posiciones y la codifique según este algoritmo.
		c. Diseña otra función que reciba dos palabras y compruebe si son equivalentes
		según este tipo de cifrado e indique el nivel de sustitución utilizado, es decir,
		si cifrando una de ellas podemos obtener la otra.
		Ej: Si recibe CASADO y FDVDGR debe indicar que son equivalentes
		y utilizan un nivel de codificación 3
		Si recibe CASADO y AAAABD debe indicar que no son equivalentes.
		El programa no debe distinguir entre mayúsculas y minúsculas.*/
		
		Scanner sc = new Scanner(System.in);
		
		String abecedario = "ABCDEFGHIJLMNÑOPQRSTUVWXYZ";
		abecedario = abecedario.toLowerCase();
		
		System.out.println("Dime una opcion:");
		Integer opcion = Integer.valueOf(sc.nextLine());
		
		if(opcion == 1) {
			System.out.println("Dime un caracter para hacer la primera funcion:");
			String caracter = String.valueOf(sc.nextLine());
			caracter = caracter.toLowerCase();
			System.out.println("Cuantas posiciones la quieres desplazar:");
			Integer posiciones = Integer.valueOf(sc.nextLine());
			System.out.println(cifradoCesarCaracter(caracter, posiciones, abecedario));
			
		}else if(opcion == 2) {
			String caracter = "";
			System.out.println("Cuantas posiciones la quieres desplazar:");
			Integer posiciones = Integer.valueOf(sc.nextLine());
			
		}
		
		
		
		
		
	}
	
	public static String cifradoCesarCaracter(String caracter, Integer posiciones, String abecedario) {
		
		String palabraCodificada = "";
		
		for(int i = 0; i < caracter.length();i++) {
			char caracterChar = caracter.charAt(i);
			int j = 0;
			while(j < abecedario.length()) {
				char abecedarioChar = abecedario.charAt(j);
				if(caracterChar == abecedarioChar) {
					if(j+posiciones > abecedario.length()-1) {
						char abecedarioCodificado = abecedario.charAt((j+posiciones)%abecedario.length());
						palabraCodificada += abecedarioCodificado;
					}else {
						char abecedarioCodificado = abecedario.charAt(j+posiciones);
						palabraCodificada += abecedarioCodificado;
					}
				}
				j++;
			}
		}
		
		
		return palabraCodificada;
	}
	
	public static String cifradoCesarCadena(String caracter) {
		Scanner sc = new Scanner(System.in);
		
		String palabraCodificada = "";
		
		System.out.println("Dime una cadena para hacer la primera funcion:");
		String cadena = String.valueOf(sc.nextLine());
		
		
		caracter = cadena;
		
		
		return palabraCodificada;
	}

}
