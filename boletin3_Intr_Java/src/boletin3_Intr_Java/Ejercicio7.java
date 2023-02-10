package boletin3_Intr_Java;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*7. Realizar una función que busque una palabra escondida dentro de un texto. Por
		ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”,
		entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver
		False. Las letras de la palabra escondida deben aparecer en el orden correcto en la
		cadena que la oculta:
		shybaoxlna ⇒ hola: True
		soybahxlna ⇒ hola: False*/
		
		System.out.println(palabraEscondida("shybaoxlna", "hola"));
		System.out.println(palabraEscondida("soybahxlna", "hola"));
	}
	
	public static boolean palabraEscondida(String cadena, String palabra) {
		boolean validacion = false;
		int posicionAnterior = -1;
		int verificado = 0;
		
		for( int i = 0; i < palabra.length(); i++) {
			char caracterPalabra = palabra.charAt(i);
			
			for (int j = 0; j < cadena.length(); j++) {
				char caracterCadena = cadena.charAt(j);
				
				if(caracterPalabra == caracterCadena && j > posicionAnterior) {
					verificado++;
					posicionAnterior = j;
				}
			}
		}
		
		if(verificado == palabra.length()) {
			validacion = true;
		}
		
		return validacion;
	}

}
