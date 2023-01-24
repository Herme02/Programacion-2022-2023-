package com.edu;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
		Debe devolver una de los siguientes mensajes según corresponda:
		◦ Letra mayúscula
		◦ Letra minúscula
		◦ Dígito entre 0 y 9
		◦ Signo de puntuación
		◦ Espacio en blanco
		◦ Paréntesis () o llaves {}
		◦ Otro carácter*/
		
		Scanner sc = new Scanner(System.in);
		
		String signosPuntuacion = ".:;";
		
		System.out.println("Inserte un caracter:");
		char caracter = sc.nextLine().charAt(0);
		
		
		
		if(Character.isUpperCase(caracter)) {
			System.out.println("Mayuscula");
		}else if(Character.isLowerCase(caracter)) {
			System.out.println("Minuscula");
		}else if(Character.isDigit(caracter)) {
			System.out.println("Numero");
		}else if(caracter == ' ') {
			System.out.println("Espacio");
		}

	}

}
