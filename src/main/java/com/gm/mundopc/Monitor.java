package com.gm.mundopc;

public class Monitor {

	private int idMonitor;
	private String marca;
	private double tamano;
	private static int contadorMonitores;
	
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, double tamano) {
		this.marca = marca;
		this.tamano = tamano;
		
	}
	
	@Override
	public String toString() {
		return "id Monitor = "+this.idMonitor+" Marca = "+this.marca+" Tamano = "+this.tamano;
	}
	
	
	
}
