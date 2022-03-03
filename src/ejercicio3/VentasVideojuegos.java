package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VentasVideojuegos {
	/**
	 * Pre:
	 * Post: Metod que devuelve una array de Strings, donde almacena las consolas sin repetirlas
	 * leyendo el documeto 
	 */
	public static ArrayList<String> informacionVideojuegos(String ruta, ArrayList<String> lista) {
		int cont = 0;
		int ocu = 0;
		try {
			File f = new File(ruta);
			Scanner l = new Scanner(f);
			while(l.hasNextLine()) {
				String li = l.nextLine();
				String[] linea = li.split(",");
				String comp = linea[2];
//				System.out.println(comp.substring(comp.length() - 1, comp.length()));
				if(comp.substring(comp.length() - 1, comp.length()).equals("\"")) {
					comp = linea[3];
				}
				if(cont == 1) {
					lista.add(comp);
				} else if (cont > 1) {
					for (int i = 0; i < lista.size(); i++) {
						if(lista.get(i).contains(comp)) {
							ocu++;
						}
					}
					if(ocu == 0 && comp.length() < 4) {
						lista.add(comp);
					} else {
						ocu = 0;
					}
				}
				cont++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		return lista;
		
	}
	/**
	 * Pre:
	 * Post: metodo main que muestra por pantalla el contenido del array despues de llamar
	 * al metodo que lo rellena
	 */
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		String ruta = "./ventasVideojuegos.csv";
		lista = informacionVideojuegos(ruta, lista);
		System.out.println("Estas son las plataformas disponibles");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}
}
