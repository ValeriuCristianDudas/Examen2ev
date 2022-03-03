package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextoExamen {
	/**
	 * Pre:
	 * Post: Este metodo devuelve un entero haciendo referencia al
	 * numero de palabras mayores que el entero recibido en la llamada
	 */
	public static int palabrasMasLargasQue(int longitud, String ruta) {
		int cont = 0;
		try {
			File f = new File (ruta);
			Scanner l = new Scanner (f);
			while(l.hasNext()) {
				String p = l.next();
				p = p.replace(".", "").replace(",", "").replace("(", "")
					.replace(")", "").replace(":", "").replace("\"", "");
				if(p.length() >= longitud) {
					cont++;
				}
			}
			l.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		return cont;
	}
	
	/**
	 * Pre:
	 * Post: Este metodo main muestra el resultado despues de llamar al metodo
	 */
	public static void main(String[] args) {
		Scanner capt = new Scanner (System.in);
		String ruta = "./textoExamen.txt";
		System.out.println("Introduce un numero");
		int i = capt.nextInt();
		System.out.println("En el documetnto textoExamen.txt hay " + palabrasMasLargasQue(i, ruta)
							+ " palabras con longitud igual o superior a " + i);
	}
}
