package com.edu;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dia:");
		dia = sc.nextInt();
		
		if(dia == 1) {
			System.out.println("Es Lunes");
		}else if(dia == 2) {
			System.out.println("Es Martes");
		}else if(dia == 3) {
			System.out.println("Es Miercoles");
		}else if(dia == 4) {
			System.out.println("Es Jueves");
		}else if(dia == 5) {
			System.out.println("Es Viernes");
		}else if (dia == 6) {
			System.out.println("Es Sábado");
		}else if (dia == 7) {
			System.out.println("Es Domingo");
		}else {
			System.out.println("Error al introducir el dia de la semana");
		}
		
		
		switch(dia) {
			
		}
	}

}
