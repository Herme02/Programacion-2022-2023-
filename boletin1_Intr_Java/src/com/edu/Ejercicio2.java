package com.edu;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
		Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime de que dia quieres que te diga la asignatura");
		String dia = sc.next();
		
		switch(dia) {
		
		case "Lunes","Miercoles":
			System.out.println("No tienes nada a primera hora");
			break;
		
		
		case "Martes","Jueves","Viernes":
			System.out.println("Ha primera hora tienes Programacion");
			break;
		
		default:
			System.out.println("El dia de la semana introducidoes incorrecto");
		}
	}

}
