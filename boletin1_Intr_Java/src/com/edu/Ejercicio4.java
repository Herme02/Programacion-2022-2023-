package com.edu;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*4. Calcular las calificaciones de un alumno con un método que reciba la nota de la
		parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
		según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
		el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
		deberá devolver un mensaje de error.
		Realiza el método que calcule la media de tres notas y te devuelva la nota del
		boletín (insuficiente, suficiente, bien, notable o sobresaliente).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota de la parte práctica(10%):");
		double nota1 = Double.valueOf(sc.nextLine());
		nota1 *= 0.1;
		
		System.out.println("Nota de la parte de problemas(50%):");
		double nota2 = Double.valueOf(sc.nextLine());
		nota2 *= 0.5;
		
		System.out.println("Nota de la parte teórica(40%):");
		double nota3 = Double.valueOf(sc.nextLine());
		nota3 *= 0.4;
		
		double notaFinal = nota1 + nota2 + nota3;
		
		System.out.println(notaFinal);

	}

}
