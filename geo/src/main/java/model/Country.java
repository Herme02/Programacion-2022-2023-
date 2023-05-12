package main.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Country {

	List<City> listaCities;
	private String id_country;
	private String name_country;
	
	public Country(String id_country, String name_country) throws IOException {
		super();
		this.id_country = id_country;
		this.name_country = name_country;
		this.listaCities = new ArrayList<>();
		addCity();
	}
	
	public void addCity() throws IOException {
		File f = new File("/home/dell/Descargas/city.txt");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		
		String linea = buffer.readLine();
		linea = buffer.readLine();
		
		String[] arrayLineas;
		
		while(linea != null) {
			arrayLineas = linea.split(",");
			
		
			if(arrayLineas[2].equals(this.id_country)) {
				this.listaCities.add(new City(arrayLineas[0], arrayLineas[1]));
				
			
			}
		linea = buffer.readLine();
		}
		buffer.close();
	}

	
	public String mostrarCiudades() {
		StringBuilder sb = new StringBuilder();
		for(City c : this.listaCities) {
			sb.append(c.toString()).append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id_country, name_country);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Country
                && this.hashCode()==((Country)obj).hashCode();
    }
	
	public String toString() {
		return String.format("Id_country: %s, name_country: %s \n, Ciudades: %s", this.id_country, this.name_country, mostrarCiudades());
	}
	
	
}