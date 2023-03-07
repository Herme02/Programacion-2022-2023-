package ejercicio5.model;

import java.util.Scanner;

import ejercicio5.com.edu.Equipo;
import ejercicio5.com.edu.Partido;

public class PartidoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Equipo e1 = new Equipo("Real Betis");
		Equipo e2 = new Equipo("Sevilla FC");
		
		int jornada = 1;
		
		System.out.println("1. Jugar partido \n"
				+ "2. Mostrar datos de la jornada \n"
				+ "3. Salir");
		
		System.out.println("Opcion:");
		int opcion = Integer.valueOf(sc.nextLine());
		
		
		
		
		while(opcion != 3) {
			
			
			
			if(opcion == 1) {
				
				System.out.println("Apuesta quiniela:");
				String quiniela = String.valueOf(sc.nextLine());
				
				Partido p = new Partido(jornada, e1, e2, 0, 0, quiniela);
				
				String resultado = p.getNumGolesLocal()+"-"+p.getNumGolesVisitante();
				
				p.ponerResultado(resultado, e1, e2);
				
				
				
				System.out.println(p.toString());
			
			
			System.out.println("1. Jugar partido \n"
					+ "2. Mostrar datos de la jornada \n"
					+ "3. Salir");
			
			System.out.println("Opcion:");
			opcion = Integer.valueOf(sc.nextLine());
		}
	}

	}
}
