package com.edu;

public class Ejercicio71 {

	public static void main(String[] args) {
		/*7. Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
		while, iii) do-while en cada una de ellas:
		
		a. Crea un método que muestre los números del 1 al 100*/
		
		for(int num = 1; num <= 100; num++) {
			System.out.println(num);
		}
		
		
		/*b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.*/
		
		for(int num = 100; num >= 1; num--) {
			System.out.println(num);
		}
		
		
		/*c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.*/
		
		for(int num = 0; num <= 100; num++) {
			if(num % 5 == 0) {
				System.out.println(num);
			}
		}

		
		/*d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.*/
		
		for(int num = 320; num >= 160; num -= 20) {
			System.out.println(num);
		}
		

	}

}
