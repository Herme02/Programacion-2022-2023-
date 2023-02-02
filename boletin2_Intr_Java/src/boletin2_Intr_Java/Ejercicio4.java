package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*4. Elabora un programa que codifique una cadena, de tal modo que en el resultado se
		inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a
		intercambiarse. Ejemplo:
		Entrada -> Hola mundo
		Salida -> oHalm nuod*/
		
		Scanner sc = new Scanner(System.in);
		
		String cadenaCodificada = "";
		
		System.out.println("Introduzca una cadena para poder codificarla:");
		String cadena = String.valueOf(sc.nextLine());
		
		for(int i = 0; i < cadena.length()-1; i+=2) {
			cadenaCodificada += cadena.charAt(i+1);
			cadenaCodificada += cadena.charAt(i);
		}
		
		System.out.println(cadenaCodificada);
	}

}