package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VentasVideojuegos {
	public static ArrayList<String> informacionVideojuegos(String ruta) {
		
		try {
			File f = new File(ruta);
			Scanner l = new Scanner(f);
			while(l.hasNextLine()) {
				String li = l.nextLine();
				String[] linea = li.split(",");
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		return null;
		
	}
	/**
	 * Pre:
	 * Post:
	 */
	public static void main(String[] args) {
		String ruta = "./ventasVideojuegos.csv";
	}
}
