package com.edu;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*6. Programar un sistema de calefacción-refrigeración que compruebe en función del
		día y el mes, la estación en la que estamos y dependiendo de la estación programe
		la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
		El método deberá recibir como parámetro el mes y el día actual y devolver los
		grados a los que deberemos programar el sistema.*/
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dia:");
		int dia = Integer.valueOf(sc.nextLine());
		
		while(dia < 1 || dia > 31) {
			System.out.println("ERROR al introducir el dia, intentelo otra vez:");
			dia = Integer.valueOf(sc.nextLine());
		}
		
		
		System.out.println("Mes:");
		int mes = Integer.valueOf(sc.nextLine());
		
		while(mes < 1 || mes > 12) {
			System.out.println("ERROR al introducir el mes,intentelo otra vez:");
			mes = Integer.valueOf(sc.nextLine());
		}
		
		
		 if(mes >= 9 && mes <= 12) {
			 
			 if(dia < 23 && mes == 9) {
				 System.out.println("Verano:24º");
			 }else if(dia > 21 && mes == 12) {
				 System.out.println("Invierno:19º");
			 }else {
				 System.out.println("Otoño:19º");
			 }
		 }else if(mes >= 1 && mes <= 3) {
			 
			 if(dia >= 21 && mes == 3) {
				 System.out.println("Primavera:20º");
			 }else {
				 System.out.println("Invierno:19º");
			 }
		 }else if(mes > 4 && mes <= 6) {
			 
			 if(dia > 20 || mes == 6) {
				 System.out.println("Verano:24º");
			 }else {
				 System.out.println("Primavera:20º");
			 }
		 }else {
			 
			 if(dia < 21 && mes == 6) {
				 System.out.println("Primavera:20º");
			 }else {
				 System.out.println("Verano:24º");
			 }
		 }
		 

	}

}
