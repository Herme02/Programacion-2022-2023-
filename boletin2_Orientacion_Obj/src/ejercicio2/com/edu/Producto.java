package ejercicio2.com.edu;

public class Producto {
	
	

	private String ID;
	private String descripcion;
	private Double precio;
	private static double  IVA;
	
	
	public Producto(String iD, String descripcion, Double precio, Double IVA) {
		super();
		this.ID = iD;
		this.descripcion = descripcion;
		this.precio = precio;
		this.IVA = IVA;
	}
	
	
	public void  modificarDescripcionProd(String nuevaDescripcion) {
		descripcion = nuevaDescripcion;
	}
	
	public void modificarPrecioProd(Double nuevoPrecio) {
		if(nuevoPrecio > 0) {
		precio = nuevoPrecio;
		}else {
			throw new ProductoException("El nuevo producto debe ser mayor que 0.");
		}
	}
	
	public static void modificarIVAProd(Double nuevoIva) {
		if(nuevoIva > 0) {
			IVA = nuevoIva;
		}else {
			throw new ProductoException("El IVA asignado no puiede ser menor que 0.");
		}
	}
	
	
	public String precioProdConIva() {
		Double precioConIva = precio * IVA;
		
		return "El precio con IVA del producto "+ID+"es de:"+precioConIva+"euros";
	}
	

	@Override
	public String toString() {
		return "Producto [ID=" + ID + ", descripcion=" + descripcion + ", precio=" + precio + ", IVA=" + IVA + " ]";
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		if(precio > 0) {
		this.precio = precio;
		}else {
			throw new ProductoException("El precio debe ser mayor que 0.");
		}
	}
	
	
	
	
}
