package boletin3_Intr_Java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Diseña un programa que cuente el número de veces que aparece una palabra en
		una cadena de texto.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena: ");
		String cadena = String.valueOf(sc.nextLine());
		System.out.println("Dime la palabra a buscar:");
		String caracter = String.valueOf(sc.nextLine());
		
		System.out.println(contadorCaracteres(cadena, caracter));
	
	}
	
	public static int contadorCaracteres(String cadena, String caracter) {
        int posicion = 0;
        int contador = 0;
       
        posicion = cadena.indexOf(caracter);
        
        while (posicion != -1) {
            contador++;                             
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        
        return contador;

}
}
