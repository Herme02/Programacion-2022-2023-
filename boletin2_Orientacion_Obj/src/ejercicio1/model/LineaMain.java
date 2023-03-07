package ejercicio1.model;

import java.util.Scanner;

import ejercicio1.com.edu.Linea;
import ejercicio1.com.edu.Punto;

public class LineaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Punto1");
		
		System.out.println("x:");
		Double x = Double.valueOf(sc.nextLine());
		
		System.out.println("y:");
		Double y = Double.valueOf(sc.nextLine());
		
		Punto p1 = new Punto(x, y);
		
		System.out.println("Punto2");
		
		System.out.println("x:");
		 x = Double.valueOf(sc.nextLine());
		
		System.out.println("y:");
		 y = Double.valueOf(sc.nextLine());
		
		Punto p2 = new Punto(x, y);
		
		Linea l1 = new Linea(p1, p2);
		
		
		System.out.println("--------------------------");
		System.out.println("1. Mover linea: Solicitará el movimiento(A-Arriba, B-Abajo, I-Izquierda, D-Derecha) y realice los movimiento");
		System.out.println("2. Mostrar linea");
		System.out.println("3. Salir");
		System.out.println("--------------------------");
		
		System.out.println("Opcion");
		Integer opcion = Integer.valueOf(sc.nextLine());
		
		while (opcion != 3) {
			
			if(opcion == 1) {
			System.out.println("Movimiento(A,B,I,D):");
			String movimiento =String.valueOf(sc.nextLine());
			
			while(!movimiento.equalsIgnoreCase("A") && !movimiento.equalsIgnoreCase("I") &&!movimiento.equalsIgnoreCase("B" )&&!movimiento.equalsIgnoreCase("D")) {
				System.out.println("ERROR al introducir el movimiento por favor vuelva a intentarlo");
				System.out.println("Movimiento(A,B,I,D):");
				movimiento =String.valueOf(sc.nextLine());
			}
			System.out.println("Cantidad a mover:");
			Double cantidad =  Double.valueOf(sc.nextLine());
			
				if(movimiento.equalsIgnoreCase("A")) {
					l1.moverArriba(cantidad);
					
				}else if(movimiento.equalsIgnoreCase("B")) {
					l1.moverAbajo(cantidad);
					
				}else if(movimiento.equalsIgnoreCase("D")) {
					l1.moverDerecha(cantidad);
					
				}else {
					l1.moverIzquierda(cantidad);
				}
			}else if(opcion == 2) {
				System.out.println(l1.toString());
			}
			
			
			System.out.println("--------------------------");
			System.out.println("1. Mover linea: Solicitará el movimiento(A-Arriba, B-Abajo, I-Izquierda, D-Derecha) y realice los movimiento");
			System.out.println("2. Mostrar linea");
			System.out.println("3. Salir");
			System.out.println("--------------------------");
			
			System.out.println("Opcion");
			opcion = Integer.valueOf(sc.nextLine());
			
			
			
		}
		
		
	}

}
