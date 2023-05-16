package plataformaOnline.jacaranda.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;



public class Temporada implements Comparable<Temporada>{
	
	private String nombreTemporada;  // Nombre de las temporada
	private List<String> capitulos; // Lista donde etán los nombres de los capítulos de la temporada
	private int sumaOpiniones;  // Suma de todas las opiniones que se han realizado de la temporada
	private int numeroOpiniones; // Número de opiniones que se han realizado de la temporada
	
	/**
	 * Constructor de una temporada. Se crea sin ningún capítulo.
	 * @param nombreTemporada: recibe el nombre de la temporada.
	 * Obviamente no se ha realizado ninguna opinión sobre la temporada
	 */
	
	public Temporada(String nombreTemporada) {
		this.nombreTemporada=nombreTemporada;
		capitulos=new ArrayList<>();
		sumaOpiniones=0;
		numeroOpiniones=0;
	}
	
	/**
	 * Método que añade un capítulo a la temporada. Se añade al final de los capítulos existente.
	 * No hay ningún control por lo que puede pasar que existan capítulos con el mismo nombre
	 * @param capitulo: nombre del capítulo a añadir
	 * @throws SerieException 
	 */
	public void annadirCapitulo(String capitulo) throws SerieException {
		
		for(String i : capitulos) {
			if(i.equals(capitulo)) {
				throw new SerieException("El capitulo de esta temporda ya existe");
			}
		}
		capitulos.add(capitulo);
	}
	
	/**
	 * Elimna un capítulo de la temporada. Devuelve true si el capítulo estaba y se ha borrado, y 
	 * devuelve false si el capítulo no estába en la lista y por lo tanto no se ha podido borrar.
	 * @param capitulo: nombre del capítulo a borrar
	 * @throws SerieException 
	 * 
	 * 	 
	 * */
	
	public boolean eliminarCapitulo (String capitulo) throws SerieException {
		boolean borrado  = false;
		
		for(String i : capitulos) {
			if(i.equals(capitulo)) {
				capitulos.remove(capitulo);
				borrado = true;
			}
		}
		
		if(borrado = false) {
			throw new SerieException("No se ha econtrado el capitulo a borrar");
		}
		
		
		return borrado;
	}
	
	/**
	 * Métodoque valora la temporada. Los valores permitidos son de 0 a 10
	 * Se debe incrementar la suma de opiniones de la temporada y el número de valores
	 * que ha recibido la valoración
	 * @param nota
	 * @throws SerieException
	 */
	public void valorar( int nota)throws SerieException {
		if (nota < 0 || nota > 10) {
			throw new SerieException("La nota no puede ser menor que 0 ni mayor que 10");
		}
		
		this.sumaOpiniones+= nota;
		this.numeroOpiniones++;
	}
	
	
	/**
	 * Debe añadir un capítulo justo detrás del capítulo que se denomina nombreCapituloAnterior.
	 * Si no encuentra el capítulo anterior  saltará la excepción
	 * @param nombreCapituloAnnadir: este será el nombre del capítulo que se añadirá
	 * @param nombreCapituloAnterior: detrás de este capítulo se debe añadir

	 * @throws SerieException: si no encuentra el capítulo que indica la posición para añadir.
	 */
	public void anadirCapituloDespues(String nombreCapituloAnnadir, String nombreCapituloAnterior) throws SerieException{
		boolean validacion = false;
		
		for(int i = 0; i < capitulos.size();i++) {
			if(capitulos.get(i).equals(nombreCapituloAnterior)) {
				capitulos.add(i+1, nombreCapituloAnterior);
				validacion = true;
			}
		}
		
		if(validacion == false) {
			throw new SerieException("No se ha encontrado el nombre del capitulo anterior");
		}
		
	}
	

	/**
	 * Devuleve el nombre del primer capítulo que contiene la palabra que  pasa por parámetro.
	 *  Si no lo encuentra salta la excepción 
	 * @param palabra
	 * @return
	 * @throws SerieException
	 */
	public String primerCapituloQueContieneEstaPalabara(String palabra) throws SerieException {
		
		boolean validacion = false;
		String capCoincidencia = "";
		
		for(int i = 0; i < capitulos.size() && validacion == false;i++) {
			if(capitulos.get(i).indexOf(palabra) != -1) {
				capCoincidencia = capitulos.get(i);
				validacion = true;
			}
		}
		
		if(validacion != true) {
			throw new SerieException("No se ha encontrado ninguna coincidencia");
		}
		
		return capCoincidencia;
	}
	
	
	
	public double getNotaMedia() {
		double notaMedia=-1;
		
		notaMedia= this.sumaOpiniones/this.numeroOpiniones;
		
		return notaMedia;
	}
	
	public String toString() {
		
		return String.format("NUmero de capitulos: %s / Nota media: %s", this.capitulos.size(), getNotaMedia());
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreTemporada);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Temporada
                && this.hashCode()==((Temporada)obj).hashCode();
    }

	@Override
	public int compareTo(Temporada o) {
		return o.capitulos.size() - this.capitulos.size();
	}

	public String getNombreTemporada() {
		return nombreTemporada;
	}


	public List<String> getCapitulos() {
		return capitulos;
	}

	public int getSumaOpiniones() {
		return sumaOpiniones;
	}

	public int getNumeroOpiniones() {
		return numeroOpiniones;
	}
	
	
	
}