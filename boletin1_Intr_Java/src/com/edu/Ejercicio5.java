package com.edu;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*5. Realiza un método que reciba una hora por parámetro y que muestre luego buenos
		días, buenas tardes o buenas noches según corresponda. Se utilizarán los tramos
		de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente, sólo teniendo en cuenta el valor
		de las horas.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hola que hora es en tu pais?");
		int hora = Integer.valueOf(sc.nextLine());
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias");
		}else if(hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		}else if((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
			System.out.println("Buenas noches");
		}else {
			System.out.println("ERROR al introducir la hora");
		}
		

	}

}
