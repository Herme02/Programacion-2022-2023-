package main.java.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

public class Feria {

	private List<Caseta> listaCasetas;
	
	public Feria() {
		this.listaCasetas = cargarCasetas("./files/casetasferia");
	}
	
	public List<Caseta> cargarCasetas(String path){
		listaCasetas = new ArrayList<>();
		
		File fichero = new File(path);
		
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			
			NodeList listaNodosEstudiantes = documento.getElementsByTagName("DatosLeidos");
			
			for(int i = 0; i < listaNodosEstudiantes.getLength(); i++) {
				Element nodo = (Element)listaNodosEstudiantes.item(i);
				
				String titulo = nodo.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = nodo.getElementsByTagName("CALLE").item(0).getTextContent();
				String numero = nodo.getElementsByTagName("NUMERO").item(0).getTextContent();
				String modulos = nodo.getElementsByTagName("MODULOS").item(0).getTextContent();
				String clase = nodo.getElementsByTagName("CLASE").item(0).getTextContent();
				String id = nodo.getElementsByTagName("ID").item(0).getTextContent();
				String id_calle = nodo.getElementsByTagName("ID_CALLE").item(0).getTextContent();
				
				Caseta c = new Caseta(titulo, calle, numero, modulos, clase, id, id_calle);
				
				listaCasetas.add(c);
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			
		}
		
		
		return listaCasetas;
	}
	
	
	
	public String mostrarCasetasDeUnaCalle(String nombreCalle) {
		StringBuilder sb = new StringBuilder();
		
		for(Caseta c : listaCasetas) {
			if(c.getCalle().equals(nombreCalle.toUpperCase())) {
				sb.append("-"+c.toString()).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
	}
	
	
	
	
	public String mostrarCasetasDeTipoFamiliar() {
		StringBuilder sb = new StringBuilder();
		
		for(Caseta c : listaCasetas) {
			if(c.getClase().equals("FAMILIAR")) {
				sb.append("-"+c.toString()).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
	}
	
	
	
	public String mostrarCasetasDeTipoDistrito() {
		StringBuilder sb = new StringBuilder();
		
		for(Caseta c : listaCasetas) {
			if(c.getClase().equals("DISTRITO")) {
				sb.append("-"+c.toString()).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
	}
	
	
	
	public String mostrarCasetasNoDistritoNoFamiliares() {
		StringBuilder sb = new StringBuilder();
		
		for(Caseta c : listaCasetas) {
			if(!c.getClase().equals("FAMILIAR") && !c.getClase().equals("DISTRITO")) {
				sb.append("-"+c.toString()).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
	}
	
	
	
	public String numCallesDeCasetasClaseFamiliar() {
		Map<String, Integer> numClaseFamiliar = new HashMap<>();
	
		
		
		for(Caseta c : this.listaCasetas) {
			if(!numClaseFamiliar.containsKey(c.getCalle())){
				numClaseFamiliar.put(c.getCalle(), 0);
			}if(c.getClase().equals("familiar".toUpperCase())){
				numClaseFamiliar.replace(c.getCalle(),numClaseFamiliar.get(c.getCalle()) , numClaseFamiliar.get(c.getCalle())+1);
			}
		}
		
		return numClaseFamiliar.toString();
	
	}
	
	
	
	public String numCallesDeCasetasClaseDistrito() {
		Map<String, Integer> numClaseDistrito = new HashMap<>();
		
		for(Caseta c : this.listaCasetas) {
			if(!numClaseDistrito.containsKey(c.getCalle())){
				numClaseDistrito.put(c.getCalle(), 0);
			}if(c.getClase().equals("familiar".toUpperCase())){
				numClaseDistrito.replace(c.getCalle(),numClaseDistrito.get(c.getCalle()) , numClaseDistrito.get(c.getCalle())+1);
			}
		}
		
		return numClaseDistrito.toString();
	}
	
	
	
	
	
	
	
	
	
	public void exportarJson() throws IOException {
		File creandoJson = new File("./files/casetas.json");
		
		creandoJson.createNewFile();
		
		Gson gson = new Gson();
		String datos = gson.toJson(this.listaCasetas);
		FileWriter fw = new FileWriter(creandoJson);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(datos);
		bw.close();
		fw.close();
	}
	
	
	
	
	
	
	
}


