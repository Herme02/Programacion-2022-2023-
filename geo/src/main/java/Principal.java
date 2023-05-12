package main.java;

import java.io.IOException;

import main.java.model.AnnadirArchivo;
import main.java.model.City;
import main.java.model.Country;

public class Principal {

	public static void main(String[] args) {
		

		try {
			Country ct1 = new Country("4","Angola");
			System.out.println(ct1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		 
		
			
			try {
				City c1 = new City("4","Acua");
				System.out.println(c1);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		
		
		
		
		try {
			AnnadirArchivo a = new AnnadirArchivo();
			a.geneadorArchivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
