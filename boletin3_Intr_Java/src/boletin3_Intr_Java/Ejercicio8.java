package boletin3_Intr_Java;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*8. Diseñar una función que reciba como parámetro tres cadenas, la primera será una
		frase y deberá buscar si existe la palabra que recibe como segundo parámetro y
		reemplazarla por la tercera.*/
		
		System.out.println(cambioFrase("Tu examen esta suspenso amigo", "suspenso", "aprobado"));
	}
	
	public static String cambioFrase(String cadena1, String cadena2, String cadena3) {
		String cadenaNueva = "";
		
		int posCoincidencia = cadena1.indexOf(cadena2);
		
		if(posCoincidencia != -1) {
			cadenaNueva += cadena1.substring(0, posCoincidencia);
			cadenaNueva += cadena3;
			cadenaNueva += cadena1.substring(posCoincidencia+cadena2.length(), cadena1.length());
			
		}
		
		return cadenaNueva;
	}

}
