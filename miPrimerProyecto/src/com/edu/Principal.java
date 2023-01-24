package com.edu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Como te llamas");
		
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		System.out.println("Buneos dias, "+nombre);
		
		byte edad = -127;
		System.out.println(edad);
		
		byte edad2 = -110;
		System.out.println(edad2);
	}

}
