package boletin2_Intr_Java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/*6. Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres
		primeros representarán la hora, minuto y segundos de la primera hora y los otros
		tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la
		segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un
		-1000 si los datos no son correctos.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora1:");
		int hora1 = Integer.valueOf(sc.nextLine());
		System.out.println("Minuto1:");
		int min1 = Integer.valueOf(sc.nextLine());
		System.out.println("Segundo1:");
		int seg1 = Integer.valueOf(sc.nextLine());
		
		System.out.println("Hora2:");
		int hora2 = Integer.valueOf(sc.nextLine());
		System.out.println("Minuto2:");
		int min2 = Integer.valueOf(sc.nextLine());
		System.out.println("Segundo2:");
		int seg2 = Integer.valueOf(sc.nextLine());
		
		System.out.println(horaMayor(hora1, min1, seg1, hora2, min2, seg2));
	}
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int resultado = -1;
		
		if((hora1 < 0||hora1 >= 24) || (hora2 < 0||hora2 >= 24) && ((min1 < 0 || min1 >= 60)||(min2 < 0 || min2 >= 60)) && (seg1 < 0 || seg1 >= 60)||(seg2 < 0 || seg2 >= 60)) {
			resultado = -1000;
		}else if(hora1 > hora2) {
			resultado = 1;
		}else if(hora2 > hora1) {
			resultado = 2;
		}else if(min1 > min2) {
			resultado = 1;
		}else if(min2 > min1) {
			resultado = 2;
		}else if(seg1 > seg2) {
			resultado = 1;
		}else if(seg2 > seg1) {
			resultado = 2;
		}else {
			resultado = 0;
		}
		
		
		return resultado;
	}

}
