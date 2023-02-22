package ejercicio4.com.edu;

import java.util.Scanner;

import ejercicio4.model.Complejo;

public class ComplejoMain {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Real1:");
			Double real1 = Double.valueOf(sc.nextLine());
			System.out.println("Imaginario1:");
			Double imaginario1 = Double.valueOf(sc.nextLine());
			System.out.println("Real2:");
			Double real2 = Double.valueOf(sc.nextLine());
			System.out.println("Imaginario2:");
			Double imaginario2 = Double.valueOf(sc.nextLine());
			
			Complejo c = new Complejo(real1, imaginario1, real2, imaginario2);
			
			System.out.println("---------------------------------------------------");
			System.out.println("1. Sumar complejos:");
			System.out.println("2. Restar complejos:");
			System.out.println("3. Mostrar informacion de los numeros complejos:");
			System.out.println("4. Validacion de igualdad de numeros complejos:");
			System.out.println("5. Salir.");
			System.out.println("---------------------------------------------------");

			
			Integer opcion = Integer.valueOf(sc.nextLine());
			
			while(opcion != 5) {
				if(opcion == 1) {
					System.out.println(c.sumarComplejos());
				}else if(opcion == 2) {
					System.out.println(c.restarComplejos());
				}else if(opcion == 3) {
					System.out.println(c.toString());
				}else if(opcion == 4) {
					String a = real1+" + "+imaginario1+"i";
					String b = real2+" + "+imaginario2+"i";
					
					System.out.println(c.equalsComplejos(a, b));
				}
				
				System.out.println("---------------------------------------------------");
				System.out.println("1. Sumar complejos:");
				System.out.println("2. Restar complejos:");
				System.out.println("3. Mostrar informacion de los numeros complejos:");
				System.out.println("4. Validacion de igualdad de numeros complejos:");
				System.out.println("5. Salir.");
				System.out.println("---------------------------------------------------");

				opcion = Integer.valueOf(sc.nextLine());
			}
			
		}
	}


