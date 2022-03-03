package ejercicio1;

public class Jugador {
	private String nombre;
	private int dorsal;
	private int potenciaDisparo;
	private int calidadPorteria;
	
	public Jugador(int dorsal) {
		genNombre();
		this.dorsal = dorsal;
		
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
	
	public void genNombre() {
		String[][] nombres = new String[][] {
				{ "Oscar", "Cristian", "Luis", "Fede", "Carlos", "Jose", "Martin", "Xavi", "Andres", "Karim", "Miguel",
						"Ivan", "Domingo", "David", "Jesus" },
				{ "Gullit", "Abad", "Jordan", "Dudas", "Martinez", "Gomes", "Manzanos", "Dumas", "Suvic", "Mendoza",
						"Guan", "Will", "Smith", "Mingueza", "Alonso" } };

		this.nombre = nombres[0][(int) (Math.floor(Math.random() * (15)))] + " "
				+ nombres[1][(int) (Math.floor(Math.random() * (15)))];

	}
	
	public int avilidadDisparo() {
		int disparo = (int) (Math.floor(Math.random() * (100)));
		return disparo;
		
	}
	
	public int avilidadPorteria() {
		int portero = (int) (Math.floor(Math.random() * (100)));
		return portero;
		
	}
}
