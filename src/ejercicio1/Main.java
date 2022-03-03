package ejercicio1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList <Jugador> jugadores = new ArrayList<Jugador>();
		int numJ = 10; //con escaner puedes poner tu la cantidad de jugadores
		for(int i = 0; i < numJ; i++) {
			Jugador j = new Jugador(i);
		}
	}
}
