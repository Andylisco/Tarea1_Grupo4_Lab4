package Dominio;

public class Empleado {
	// declaracion de variables
	private int id;
	private String nombre;
	private int edad;
	static int idIni = 999;
// creacion de constructores	
	public Empleado() {
		this.edad = 99;
		this.nombre = "sin nombre";
	}
	public Empleado(String nombre, int edad) {
		this.id = idIni;
		this.nombre = nombre;
		this.edad = edad;
	}
}
