package main.java.model;

import java.util.Objects;

public class Caseta {

	private String titulo;
	private String calle;
	private String numero;
	private String modulos;
	private String clase;
	private String id;
	private String id_calle;
	
	
	public Caseta(String titulo, String calle, String numero, String modulos, String clase, String id,
			String id_calle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulos = modulos;
		this.clase = clase;
		this.id = id;
		this.id_calle = id_calle;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getCalle() {
		return calle;
	}


	public String getNumero() {
		return numero;
	}


	public String getModulos() {
		return modulos;
	}


	public String getClase() {
		return clase;
	}


	public String getId() {
		return id;
	}


	public String getId_calle() {
		return id_calle;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(titulo,calle,numero,modulos,clase,id,id_calle);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Caseta
                && this.hashCode()==((Caseta)obj).hashCode();
    }
	
	
	public String toString() {
		return String.format("TITULO: %s | CALLE: %s | NUMERO: %s | MODULOS: %s | CLASE: %s | ID: %s | ID_CALLE: %s", this.titulo, this.calle, this.numero, this.modulos, this.clase, this.id, this.id_calle);
	}
}
