package plataformaOnline.jacaranda.com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Serie implements Comparable<Serie>{
	private static final int ANNO_MINIMO = 1900; // Sólo se almacenrará series posteriores a 1900
	private String nombreSerie; // Nombre de la serie
	private int anno; //Año de la primera temporada de la serie
	private Tema tema; // Tema de la serie
	private ArrayList<Temporada> temporadas; // Lista de las temporadas de las series.
	
	
	/**
	 * Constructor que recibe el nombre de la serie, el año de creación y el tema.  Se crea la serie sin ninguna temporada
	 * @param nombreSerie
	 * @param anno
	 * @param tema
	 * @throws SerieException: si el año es anterior a 1900 se lanzará una exception
	 */
	public Serie(String nombreSerie, int anno, Tema tema) throws SerieException {
		super();
		this.nombreSerie = nombreSerie;
		setAnno(anno);
		this.tema = tema;
		temporadas=new ArrayList<Temporada>();
	}
	
	/**
	 * Añade una nueva temporada. Se le pasará el nombre de la nueva temporada y se añadirá al final.
	 * Debe comprobar que no existe un temporada con ese nombre en cuyo caso saltará la excepción.
	 * @param nombreTemporada
	 * @throws SerieException
	 */
	public void annadirTemporada( String nombreTemporada) throws SerieException {
	
		for(Temporada i : temporadas) {
			if(i.equals(nombreTemporada)) {
				throw new SerieException("Ya existe una te,porada en esta serie con este mismo nombre");
			}
		}
		
		temporadas.add(new Temporada(nombreTemporada));
		
	}
	
	
	/**
	 * Añade un nuevo capítulo a una temporada. Se le pasará el nombre de la temporada y si la temporada no existe
	 * se lanzará una exception
	 * @param nombreTemporada
	 * @param nombreCapitulo
	 * @throws SerieException
	 */
	public void annadirCapituloTemporada( String nombreTemporada, String nombreCapitulo) throws SerieException {
		boolean validacion = false;
		
		for( int i = 0; i < temporadas.size() && validacion != true;i++) {
			if(temporadas.get(i).equals(nombreTemporada)) {
				temporadas.get(i).annadirCapitulo(nombreCapitulo);
				validacion = true;
			}
		}
		
		if(validacion == false) {
			throw new SerieException("No se ha encontrado una temporada a la que añadir un capitulo");
		}
	}
	
	
	/**
	 * Valorar temporada. Si no exsite la temporada lanza una exception.
	 * @param nombreTemporada
	 * @param valoracion
	 * @throws SerieException
	 */
	
	public void valorarTemporada(String nombreTemporada, int valoracion) throws SerieException {
		boolean validacion = false;
		
		for( int i = 0; i < temporadas.size() && validacion != true;i++) {
			if(temporadas.get(i).equals(nombreTemporada)) {
				temporadas.get(i).valorar(valoracion);
				validacion = true;
			}
		}
		
		if(validacion == false) {
			throw new SerieException("No se ha encontrado una temporada a valorar");
		}
	
	}
	/**
	 * Devuelve un listado de las temporadas de una serie ordenadas  de mayor a menor por nota media. 
	 * De cada temporada se mostrará el nombre, número de capítulos y nota media
	 * @return
	 */
	public String listadoTemporadasPorNotaMedia() {
		StringBuilder sb = new StringBuilder();
		
		Collections.sort(this.temporadas);
		
		for(Temporada i : temporadas) {
			sb.append(i).append(System.lineSeparator());
		}
		
		return sb.toString();
	}
	
	
	
	

	/**
	 * Devuelve un listado de las temporadas de una serie ordenadas de menor a mayor por número de capítulos. 
	 * De cada temporada se mostrará el nombre, número de capítulos y nota media.
	 * @return
	 */
	public String listadoTemporadasPorNumeroDeCapitulos() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(this.temporadas);
		for(Temporada i : this.temporadas) {
			sb.append(i).append(System.lineSeparator());
		}
		return sb.toString();
	}

	
	/**
	 * Devuelve el nombre de la Serie
	 * @return
	 */
	public String getNombreSerie() {
		return nombreSerie;
	}


	/** Asigna el nombre de la serie
	 * 
	 * @param nombreSerie
	 */
	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}


	/**
	 * Devuelve el año
	 * @return
	 */
	public int getAnno() {
		return anno;
	}


	/**
	 * Asinga el año
	 * @param anno
	 * @throws SerieException
	 */
	public void setAnno(int anno) throws SerieException {
		if ( anno < ANNO_MINIMO) {
			throw new SerieException("Anno incorrecto");
		}
		this.anno = anno;
	}


	/**
	 * Devuelve el tema
	 * @return
	 */
	public Tema getTema() {
		return tema;
	}

	/** Asinga el tema
	 * 
	 * @param tema
	 */
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	/** 
	 * Devuelve el número de temporadas que tiene la serie
	 * @return
	 */
	public int numeroTemporadas() {
		return temporadas.size();
	}

	
	/**
	 * toString
	 */
	public String toString() {
		
		return String.format("Serie: %s / Año: %s / Tema: %s / Numero temporadas: %s", this.nombreSerie, this.anno, this.tema, this.numeroTemporadas());
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreSerie);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Serie
                && this.hashCode()==((Serie)obj).hashCode();
    }

	@Override
	public int compareTo(Serie o) {
		return o.anno-this.anno;

	}
	
	
	public void generarFicheroCsvTemporada() throws IOException {
		File f = new File("./files/temporada.csv");
		f.createNewFile();
		PrintWriter writer = new PrintWriter(f);

		writer.write("nombreSerie,nombreTemporada,numeroCapitulos,sumaOpiniones,numeroOpiniones" + System.lineSeparator());
		writer.write("--------------------" + System.lineSeparator());
		for(Temporada t : this.temporadas) {
			writer.write(String.format("%s,%s,%s,%s,%s %s",this.nombreSerie,t.getNombreTemporada(),t.getCapitulos().size(),t.getSumaOpiniones(),t.getNumeroOpiniones(),System.lineSeparator()));
		}
		writer.close();
	}


	
	
	
	
	
}