package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*3. Diseña una función que, dada una cadena de entrada, comprueba si es una
		contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
		más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
		de puntuación y al menos un dígito.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu contraseña:");
		String contrasena = String.valueOf(sc.nextLine());
		
		
		System.out.println(validacionContraseña(contrasena));
		

		
	}
	
	public static String validacionContraseña(String contrasena) {
		String tipoContrasena = "La contraseña es DEBIL"; 
		
		int numMayus = 0;
		int numMinus = 0;
		int signosPunt = 0;
		int numDigit = 0;
		
		
		for(int i = 0; contrasena.length() > i; i++) {
			char caracterContrasena = contrasena.charAt(i);
			if(Character.isUpperCase(caracterContrasena)) {
				numMayus++;
			}else if(Character.isLowerCase(caracterContrasena)) {
				numMinus++;
			}else if(caracterContrasena == '.' || caracterContrasena == ':' || caracterContrasena == ';') {
				signosPunt++;
			}else if(Character.isDigit(caracterContrasena)) {
				numDigit++;
			}
		}
		
		if(contrasena.length() >= 8 && numMayus > 0 && numMinus > 0 && signosPunt > 0 && numDigit > 0) {
			tipoContrasena = "LA contraseña es FUERTE";
		}
		
		
		
		return tipoContrasena;
	}
	
}

