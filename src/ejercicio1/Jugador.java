package ejercicio1;

public class Jugador {
	private String nombre;
	private int dorsal;
	private int potenciaDisparo;
	private int calidadPorteria;
	private int vidas;
	
	/**
	 * Pre:
	 * Post: Metodo constructor para jugadores convecionales
	 */
	public Jugador(int dorsal) {
		genNombre();
		this.dorsal = dorsal;
		this.potenciaDisparo = habilidadDisparo();
		this.calidadPorteria = habilidadPorteria();
		this.vidas = 2;
		
	}
	
	/**
	 * Pre:
	 * Post: Metodo constructor para mejor Jugador
	 */
	public Jugador() {
		this.nombre = "Cristiano Ronaldo";
		this.dorsal = 777;
		this.potenciaDisparo = 1000;
		this.calidadPorteria = 1000;
		this.vidas = 2;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getPotenciaDisparo() {
		return potenciaDisparo;
	}
	public void setPotenciaDisparo(int potenciaDispara) {
		this.potenciaDisparo = potenciaDispara;
	}
	public int getCalidadPorteria() {
		return calidadPorteria;
	}
	public void setCalidadPorteria(int calidadPortera) {
		this.calidadPorteria = calidadPortera;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	/**
	 * Pre:
	 * Post: Genera aleatoriamente los nombres
	 */
	public void genNombre() {
		String[][] nombres = new String[][] {
				{ "Oscar", "Cristian", "Luis", "Fede", "Carlos", "Jose", "Martin", "Xavi", "Andres", "Karim", "Miguel",
						"Ivan", "Domingo", "David", "Jesus" },
				{ "Gullit", "Abad", "Jordan", "Dudas", "Martinez", "Gomes", "Manzanos", "Dumas", "Suvic", "Mendoza",
						"Guan", "Will", "Smith", "Mingueza", "Alonso" } };

		this.nombre = nombres[0][(int) (Math.floor(Math.random() * (15)))] + " "
				+ nombres[1][(int) (Math.floor(Math.random() * (15)))];

	}
	
	/**
	 * Pre:
	 * Post: Otorga aleatoriamente la habilidad de disparo
	 */
	public int habilidadDisparo() {
		int disparo = (int) (Math.floor(Math.random() * (100)));
		return disparo;
		
	}
	
	/**
	 * Pre:
	 * Post: Otorga aleatoriamente la habilidad en la porteria
	 */
	public int habilidadPorteria() {
		int portero = (int) (Math.floor(Math.random() * (100)));
		return portero;
		
	}
	
	/**
	 * Pre:
	 * Post: Metodo que devuelve en un String las variables de los Jugadores
	 */
	public String toString() {
		String datos = "Nombre: " + this.nombre + " Dorsal: " + this.dorsal + " Disparo: " 
						+ this.calidadPorteria + " Porteria: " + this.calidadPorteria + " Vidas: "
						+ this.vidas;
		return datos;
		
	}
}
