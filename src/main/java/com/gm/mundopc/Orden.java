package com.gm.mundopc;

import java.util.Iterator;

public class Orden {

	private int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private  int contadorComputadoras=0;
	private static final int maxComputadoras = 4;
	
	public Orden() {
		 this.idOrden = ++contadorOrdenes;
		 computadoras =new Computadora[maxComputadoras];
	}
	
	public void AgregarComputadora(Computadora computadora) {
		
		
		if(this.contadorComputadoras < maxComputadoras) {
			
			this.computadoras[this.contadorComputadoras++] = computadora;
			
		}else {
			System.out.println("Ya se ha sobrepasado del limite de computadoras permitidas");
		}
		
	}
	
	public void mostrarOrden() {
	
		for(int i = 0; i < this.contadorComputadoras; i++)
		{
		System.out.println("id Orden = "+this.idOrden+ "Computadora ="+computadoras[i]);
		}
		}
	
}
