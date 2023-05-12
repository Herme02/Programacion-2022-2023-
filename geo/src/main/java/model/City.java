package main.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {

	List<Address> listaAddress;
	private String id_city;
	private String name_city;
	
	
	public City(String id_city, String name_city) throws IOException {
		super();
		this.id_city = id_city;
		this.name_city = name_city;
		this.listaAddress = new ArrayList<>();
		addAddress();
	}
	
	public void addAddress() throws IOException{
		File f = new File("/home/dell/Descargas/address.txt");
		
		BufferedReader buffer = new BufferedReader(new FileReader(f));
		
		String linea = buffer.readLine();
		linea = buffer.readLine();
		
		String[] arrayLineas;
		
		while(linea != null) {
			arrayLineas = linea.split(",");
			
			try {
				if(arrayLineas[4].equals(this.id_city)) {
					this.listaAddress.add(new Address(arrayLineas[0], arrayLineas[1]));
				}
			
			}catch (ArrayIndexOutOfBoundsException e) {
				
			}
			
			linea = buffer.readLine();
		}
		
		buffer.close();
	}
	

	public String getName_city() {
		return this.name_city;
	}
	
	
	public int numAddress() {
		return this.listaAddress.size();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id_city, name_city);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof City
                && this.hashCode()==((City)obj).hashCode();
    }
	
	
	@Override
	public String toString() {
		return String.format("City_id: %s, name_City: %s, address:%s ", this.id_city,this.name_city, numAddress());
	}
	
}
