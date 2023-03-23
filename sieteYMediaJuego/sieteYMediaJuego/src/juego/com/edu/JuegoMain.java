package juego.com.edu;

import java.util.Scanner;

import juego.model.Baraja;
import juego.model.Carta;

public class JuegoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al juego de las 7 y media");
		
		Baraja b = new Baraja();
		
		double puntosJugador1 = 0;
		double puntosMaquina = 0;
		
		System.out.println("Comienza el jugador 1:");
		
		System.out.println("Quieres una carta(S/N):");
		String pedirCarta = String.valueOf(sc.nextLine());
		
		while(pedirCarta.equalsIgnoreCase("S") && puntosJugador1 <= 7.5){
			b.getSiguiente(b);
			puntosJugador1 += b.getCarta().getValor();
			
			System.out.println(b.toString());
			System.out.println(puntosJugador1);
			
			if(puntosJugador1 > 7.5) {
				System.out.println("LO SIENTO, EL JUGADOR 1 A PERDIDO");
			}else {
				System.out.println("Quieres una carta(S/N):");
				pedirCarta = String.valueOf(sc.nextLine());
			}
			
			
		}
		
		
		if(puntosJugador1 <= 7.5) {
		System.out.println("Ahora es el turno de la banca:");
		
		while(puntosMaquina < 6.5) {
			b.getSiguiente(b);
			puntosMaquina += b.getCarta().getValor();
			System.out.println(b.toString());
			System.out.println(puntosMaquina);
			
			if(puntosMaquina > 7.5) {
				System.out.println("LO SIENTO, LA BANCA A PERDIDO A PERDIDO, HA HECHO "+puntosMaquina+ " puntos.");
			}
		}
		
		if(puntosJugador1 <= 7.5 && puntosMaquina <= 7.5) {
			if(puntosJugador1 > puntosMaquina) {
				System.out.println("El ganador es el jugador 1");
			}else if(puntosJugador1 < puntosMaquina) {
				System.out.println("El ganador es la maquina");
			}else {
				System.out.println("Ha habido un EMPATE");
			}
		}
		
		
	}
	}
}
