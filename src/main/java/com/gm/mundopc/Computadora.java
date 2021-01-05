package com.gm.mundopc;

public class Computadora {

	private int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	public Computadora() {}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this.nombre =nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	@Override
	public String toString(){
		return "Nombre = "+this.nombre+""
				+ " Monitor ="+this.monitor+" Teclado = "+this.teclado+" Raton = "+this.raton;
	}
	
	
	
}
