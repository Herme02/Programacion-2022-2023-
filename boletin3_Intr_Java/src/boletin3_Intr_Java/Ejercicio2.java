package boletin3_Intr_Java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
		igual a 0, 3, 6 ó 9.
		
		Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
		pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
		
		Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo. El
		programa debe comprobar que el número facilitado es válido.*/
		
		Scanner sc = new Scanner(System.in);
		
		boolean validacion = false;
		
		System.out.println("Dime un numero");
		String num = String.valueOf(sc.nextLine());
		
		int sumaPrimera = 0;
		int sumaSegunda = 0;
		String numFinal = "";
		
		for(int i = 0; i < num.length();i++) {
			char caracter = num.charAt(i);
			caracter = (char)Character.getNumericValue(caracter);
			sumaPrimera += caracter;
		}
		numFinal += sumaPrimera;
		
		for(int j = 0; j < numFinal.length();j++) {
			char caracterFinal = numFinal.charAt(j);
			caracterFinal = (char) Character.getNumericValue(caracterFinal);
			sumaSegunda += caracterFinal;
			
		}
		
		if(sumaSegunda == 0 || sumaSegunda == 3 || sumaSegunda == 6 || sumaSegunda == 9) {
			validacion = true;
		}
		
		System.out.println(validacion);
	}

	

}
