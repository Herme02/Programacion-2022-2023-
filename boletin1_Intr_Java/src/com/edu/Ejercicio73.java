package com.edu;

public class Ejercicio73 {

	public static void main(String[] args) {
		/*7. Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
		while, iii) do-while en cada una de ellas:
		
		a. Crea un método que muestre los números del 1 al 100*/
		
		int num = 1;
		
		do {
			System.out.println(num);
			num++;
		}while(num <= 100);
		
		
		
		
		/*b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.*/
	
		num = 100;
		
		do {
			System.out.println(num);
			num--;
		}while(num >= 1);
		
		
		
		
		/*c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.*/
		
		num = 0;
		
		do {
			if(num % 5 == 0) {
				System.out.println(num);
			}
			num++;
		}while(num <= 100);
		
		
		
		
		
		/*d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.*/
		
		num = 320;

		do {
			System.out.println(num);
			num -= 20;
		}while(num>= 160);
		
		
		
	}

}
