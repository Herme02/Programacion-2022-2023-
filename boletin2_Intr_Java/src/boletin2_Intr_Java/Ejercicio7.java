package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*7. Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
		tres primeros representarán la hora, minuto y segundos de la primera hora y los
		otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
		entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
		datos no son correctos se deberá devolver -1000.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora1:");
		int hora1 = Integer.valueOf(sc.nextLine());
		if(hora1 < 0 || hora1 >= 24) {
			System.out.println("ERROR, por favor vuelva a introducirlo:");
			hora1 = Integer.valueOf(sc.nextLine());
		}
		
		System.out.println("Minuto1:");
		int min1 = Integer.valueOf(sc.nextLine());
		if(min1 < 0 || min1 >= 60) {
			System.out.println("ERROR, por favor vuelva a introducirlo:");
			min1 = Integer.valueOf(sc.nextLine());
		}
		
		System.out.println("Segundo1:");
		int seg1 = Integer.valueOf(sc.nextLine());
		if(seg1 < 0 || seg1 >= 60) {
			System.out.println("ERROR, por favor vuelva a introducirlo:");
			seg1 = Integer.valueOf(sc.nextLine());
		}
			
		System.out.println("Hora2:");
		int hora2 = Integer.valueOf(sc.nextLine());
		if(hora2 < 0 || hora2 >= 24) {
			System.out.println("ERROR, por favor vuelva a introducirlo:");
			hora2= Integer.valueOf(sc.nextLine());
		}
		
		System.out.println("Minuto2:");
		int min2 = Integer.valueOf(sc.nextLine());
		if(min2 < 0 || min2 >= 60) {
			System.out.println("ERROR, por favor vuelva a introducirlo:");
			min2 = Integer.valueOf(sc.nextLine());
		}
		
		
		System.out.println("Segundo2:");
		int seg2 = Integer.valueOf(sc.nextLine());
		if(seg2 < 0 || seg2 >= 60) {
			System.out.println("ERROR, por favor vuelva a introducirlo:");
			seg2 = Integer.valueOf(sc.nextLine());
		
		}
		
		System.out.println(segundosEntre(hora1, min1, seg1, hora2, min2, seg2));
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		
		
		int numSegundos = 0;
		
		if(hora1 == hora2 && min1 == min2) {
			numSegundos += (seg1-seg2);
		}else if(hora1 == hora2 && min1 != min2) {
			numSegundos += (min1-min2) * 60;
			numSegundos += (seg1-seg2);
		}else {
			numSegundos += (hora1-hora2) * 3600;
			numSegundos += (min1-min2) * 60;
			numSegundos += (seg1-seg2);
		}
		
		if(numSegundos < 0) {
			numSegundos *= -1;
		}
		
		
		return numSegundos;
	}
	
	}

