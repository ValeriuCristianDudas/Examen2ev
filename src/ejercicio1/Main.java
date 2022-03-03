package ejercicio1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList <Jugador> jugadores = new ArrayList<Jugador>();
		int numJ = 10; //con escaner puedes poner tu la cantidad de jugadores
		for(int i = 0; i < numJ; i++) {
			Jugador j = new Jugador(i);
			jugadores.add(j);
		}
		
		while(numJ > 1) {
			for(int ju = 0; ju < jugadores.size(); ju++) {
				int jud = ju + 1;
				if(ju == jugadores.size() - 1) {
					jud = 0;
				}
				Jugador p = jugadores.get(ju);
				Jugador d = jugadores.get(jud);
				System.out.println("Poretero: " + p.getNombre() + " Dorsal: " + p.getDorsal());
				System.out.println("Jugador: " + d.getNombre() + " Dorsal: " + d.getDorsal());
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
				
			}
		}
	}
}
