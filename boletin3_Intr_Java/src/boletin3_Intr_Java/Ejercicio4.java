package boletin3_Intr_Java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*4. Crea tres funciones cuyo comportamiento sea como el de los métodos de String
		startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte una cadena:");
		String cadena = String.valueOf(sc.nextLine());
		
		System.out.println("Caracter o palabra a buscar:");
		String caracter = String.valueOf(sc.nextLine());
		
		System.out.println(startsWith(cadena, caracter));
	}
	
	public static boolean startsWith(String cadena, String palabra) {
		 boolean validacion = false;
		 int contVerificado = 0;
		 
		 for(int i = 0; i < palabra.length();i++) {
			 char caracter = palabra.charAt(i);
			 char caracterBuscar = cadena.charAt(i);
			 
			 if(caracter == caracterBuscar) {
				 contVerificado++;
			 }
			 
			 
		 }
		 
		 if(contVerificado == palabra.length()) {
			 validacion = true;
		 }
		 
		 return validacion;
	}
		
	
	

	
	public static boolean endsWith(String cadena, String palabra) {
		 boolean validacion = false;
		 int contVerificado = 0;
		 int cont = cadena.length()-palabra.length();
		 
		 for(int i = 0; i < palabra.length(); i++) {
			 char caracter = palabra.charAt(i);
			 char caracterBuscar = cadena.charAt(cont+i);
			 
			 if(caracter == caracterBuscar) {
				 contVerificado++;
			 }

		 }
		 
		 if(contVerificado == palabra.length()) {
			 validacion = true;
		 }
		 
		 
		 
		 return validacion;
	}
	
	public static boolean contains(String cadena, String palabra) {
		boolean validacion = false;
		
		int indicePalabra = 0;
		
		for(int i = 0; i< cadena.length();i++) {
			if(cadena.charAt(i)== palabra.charAt(indicePalabra)) {
				indicePalabra++;
				if(indicePalabra == palabra.length()){
					validacion = true;
				}
			}else {
				indicePalabra = 0;
			}
		}
		
		return validacion;
	}

	
	
}
