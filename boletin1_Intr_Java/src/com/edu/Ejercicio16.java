package com.edu;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		/*16. Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
		Mostrar su suma y cuantos hay mayores de 1000€.*/
		
		Scanner sc = new Scanner(System.in);
		
		double sumaTotal = 0;
		int contSalario = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Cuanto tiene de salario mensual el empleado numero "+i);
			double salario = Double.valueOf(sc.nextLine());
			sumaTotal += salario;
			
			if(salario > 1000) {
				contSalario++;
			}
			System.out.println("----------------------");
		}
		
		System.out.println("La suma total de los salarios es de "+sumaTotal);
		System.out.println("Hay "+contSalario+" empleado/s co un salario superior de 1000");
	}

}
