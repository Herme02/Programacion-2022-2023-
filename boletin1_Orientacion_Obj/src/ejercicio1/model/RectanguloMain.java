package ejercicio1.model;

import java.util.Scanner;

import ejercicio1.com.edu.Rectangulo;

public class RectanguloMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Ancho:");
		Double ancho = Double.valueOf(sc.nextLine());
		
		System.out.println("Longitud:");
		Double longitud = Double.valueOf(sc.nextLine());
		
		Rectangulo r1 = new Rectangulo(longitud, ancho);

		System.out.println(r1.calcularPerimetro());
		System.out.println(r1.calcularArea());
	}

}
