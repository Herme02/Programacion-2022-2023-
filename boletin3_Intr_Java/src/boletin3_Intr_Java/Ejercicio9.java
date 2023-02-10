package boletin3_Intr_Java;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*9. Escribir una función que devuelva el número de palabras, frases y párrafos que
		existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
		dos palabras puede haber más de un blanco, las frases se separan por puntos y los
		párrafos por saltos de línea.*/
		
		System.out.println(palabrasFrasesParrafos("Hola,me llamo Hermenegildo."));
	}
	
	public static StringBuilder palabrasFrasesParrafos(String cadena) {
		StringBuilder sb = new StringBuilder("");
		
		int palabra = 1;
		int frase = 0;
		int parrafo = 1;
		
		for(int i = 0; i < cadena.length();i++) {
			char caracter = cadena.charAt(i);
			
			if(caracter == ' ' || caracter == ',') {
				palabra++;
			}else if(caracter == '.') {
				frase++;
			}
		}
		
		sb.append("Palabras:"+palabra+ ", frases:"+frase+ ", parrafo:"+parrafo);
		
		return sb;
	}

}