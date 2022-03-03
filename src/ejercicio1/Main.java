package ejercicio1;

import java.util.ArrayList;

public class Main {
	/**
	 * Pre:
	 * Post: Metodo main donde se ejecuta todo, crea objetos tipo jugador para el juego, y calcula
	 * los resultados
	 */
	public static void main(String[] args) {
		ArrayList <Jugador> jugadores = new ArrayList<Jugador>();
		//con escaner puedes poner tu la cantidad de jugadores
		int numJ = 9;
		//jugador añadido para que el juego pare por si hay mucha coincidencia
		//entre las habilidades de los jugadores
		Jugador buenisimo = new Jugador();
		jugadores.add(buenisimo);
		for(int i = 0; i < numJ; i++) {
			Jugador j = new Jugador(i + 1);
			jugadores.add(j);
		}
		
		// numJ + 1 porque hay un jugador añadido fuera del bucle
		while(numJ + 1 > 1) {
			for(int ju = 0; ju < jugadores.size(); ju++) {
				int jud = ju + 1;
				if(ju == jugadores.size() - 1) {
					jud = 0;
				}
				Jugador p = jugadores.get(ju);
				Jugador d = jugadores.get(jud);
				System.out.println("Poretero: " + p.toString());
				System.out.println("Jugador: " + d.toString());
				if(p.getCalidadPorteria() < d.getPotenciaDisparo()) {
					p.setVidas(p.getVidas() - 1);
					System.out.println("GOL\n");
				} else if (p.getCalidadPorteria() == d.getPotenciaDisparo()) {
					int prob = (int) (Math.floor(Math.random() * (100)));
					if(prob > 49) {
						p.setVidas(p.getVidas() - 1);
						System.out.println("GOL\n");
					} else {
						System.out.println("FALLO\n");
					}
				} else {
					System.out.println("FALLO\n");
				}
				if(p.getVidas() == 0) {
					numJ--;
					jugadores.remove(ju);
				}
				
			}
		}
		System.out.println("GANADOR");
		// muestro con un bucle para saber que solo hay un jugador en el array
		for(int a = 0; a < jugadores.size(); a++) {
			System.out.println(jugadores.get(a).getNombre());
		}
	}
}
