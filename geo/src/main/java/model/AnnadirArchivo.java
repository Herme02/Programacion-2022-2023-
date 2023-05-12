package main.java.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AnnadirArchivo {

private Set<Country> listaCountry;
	
	public AnnadirArchivo() throws IOException {
		super();
		this.listaCountry = new HashSet<>();
		addCountry();
	}
	
	private void addCountry() throws IOException {
		File f = new File("/home/dell/Descargas/country.txt");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		
		String linea = buffer.readLine();
		
		linea = buffer.readLine();
		
		String[] arrayLinea;
		
		while(linea != null) {
			arrayLinea = linea.split(",");
			
			this.listaCountry.add(new Country(arrayLinea[0], arrayLinea[1]));
			
			linea = buffer.readLine();
		}
	}
	
	public void geneadorArchivo() throws IOException {
		File f = new File("/home/dell/Descargas/archivoGenerado.txt");
		
		f.createNewFile();
		
		FileWriter writer = new FileWriter(f);
		
		BufferedWriter bufferWriter = new BufferedWriter(writer);
		
		for(Country c : this.listaCountry) {
			bufferWriter.append(c.toString());
			bufferWriter.newLine();
		}
		
		bufferWriter.close();
		writer.close();
		
		
	}
}
