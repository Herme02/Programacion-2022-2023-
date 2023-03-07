package ejercicio2.model;

import java.util.Scanner;

import ejercicio2.com.edu.Producto;

public class ProductoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El IVA aplicado a los productos será de:");
		double IVA = Double.valueOf(sc.nextLine());
		
		Producto p1 = new Producto("A1", "Es una manzanaq muy roja", 3.99, IVA);
		Producto p2 = new Producto("A2", "La pizza tiene mucho ingredientes", 4.99,IVA);
		Producto p3 = new Producto("A3", "La pera es verde", 2.99, IVA);
		
		System.out.println("-------------------------------------------");
		System.out.println("1. Modificaar descripcion/precio producto:");
		System.out.println("2. Cambiar IVA");
		System.out.println("3. Precio venta del producto mas IVA");
		System.out.println("4. Informacion de los productos");
		System.out.println("5. Salir");
		System.out.println("-------------------------------------------");

		
		System.out.println("Opcion:");
		Integer opcion = Integer.valueOf(sc.nextLine());
		
		while(opcion != 5) {
			if(opcion == 1) {
				System.out.println("ID del producto a modificar:");
				String IdProducto = String.valueOf(sc.nextLine());
				
				System.out.println("Deseas cambiar el precio del producto o modificar su descripción(P/D)");
				String opcion2 = String.valueOf(sc.nextLine());
				if(opcion2.equalsIgnoreCase("D")) {
					if(IdProducto.equalsIgnoreCase(p1.getID())) {
						System.out.println("Nueva descripcion:");
						String nuevaDescripcion = String.valueOf(sc.nextLine());
						
						p1.modificarDescripcionProd(nuevaDescripcion);
						
					}else if(IdProducto.equalsIgnoreCase(p2.getID())) {
						System.out.println("Nueva descripcion:");
						String nuevaDescripcion = String.valueOf(sc.nextLine());
						
						p2.modificarDescripcionProd(nuevaDescripcion);
						
					}else if(IdProducto.equalsIgnoreCase(p3.getID())) {
						System.out.println("Nueva descripcion:");
						String nuevaDescripcion = String.valueOf(sc.nextLine());
						
						p3.modificarDescripcionProd(nuevaDescripcion);
					}
				}else if(opcion2.equalsIgnoreCase("P")) {
					if(IdProducto.equalsIgnoreCase(p1.getID())) {
						System.out.println("Nuevo precio::");
						Double nuevoPrecio = Double.valueOf(sc.nextLine());
						
						p1.modificarPrecioProd(nuevoPrecio);
						
					}else if(IdProducto.equalsIgnoreCase(p2.getID())) {
						System.out.println("Nuevo precio::");
						Double nuevoPrecio = Double.valueOf(sc.nextLine());
						
						p2.modificarPrecioProd(nuevoPrecio);
						
					}else if(IdProducto.equalsIgnoreCase(p3.getID())) {
						System.out.println("Nuevo precio::");
						Double nuevoPrecio = Double.valueOf(sc.nextLine());
						
						p3.modificarPrecioProd(nuevoPrecio);
					}
				}
			}else if(opcion == 2) {
				System.out.println("Nuevo IVA para los productos:");
				Double nuevoIVA = Double.valueOf(sc.nextLine());
				
				Producto.modificarIVAProd(nuevoIVA);
				
				
			}else if(opcion == 3) {
				
			}
		}
	}

}
