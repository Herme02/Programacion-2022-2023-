package com.edu;

import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		
		/*3. Realiza un programa (días del mes) que pregunte por un mes y año y
		devuelva el número de días que tiene ese mes para el año especificado.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De que mes quieres saber los dias:");
		int mes = sc.nextInt();
		
		switch(mes) {
		case 1,3,5,7,8,10,12:
			System.out.println("Este mes tiene 31 dias");
			break;
		
		case 4,6,9,11:
			System.out.println("Este mes tiene 30 dias");
			break;
			
		case 2:
			System.out.println("Este mes tiene 28 dias");
			break;
		
			default:
				System.out.println("Mes introducido erroneo");
	}

	}
}
