package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*1. Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba
		los coeficientes de una ecuación de segundo grado y devuelva el número de
		soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
		que ser distinto de cero) debe devolver un -1.*/
		
		System.out.println(numeroSolucionesEcuacionSegundoGrado());
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static String numeroSolucionesEcuacionSegundoGrado() {
		String resultado = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de 'a':");
		int a = Integer.valueOf(sc.nextLine());
		
		System.out.println("Valor de 'b':");
		int b = Integer.valueOf(sc.nextLine());
		
		System.out.println("Valor de 'c':");
		int c = Integer.valueOf(sc.nextLine());
		
		if(a == 0) {
			resultado = "Solucion: -1";
		}else {
			double solucion1 = ((-b)+(Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
			double solucion2 = ((-b)-(Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
			
			System.out.println(solucion1);
			
			resultado = "Solucion1: "+solucion1+ " / Solucion2: "+solucion2;
		}
		
		
		return resultado;
	}

}
