package com.gm.mundopc;

import java.util.Iterator;

public class Orden {

	private int idOrden;
	private Computadora computadoras[];
	private int contadorOrdenes;
	private static int contadorComputadoras=0;
	private static final int maxComputadoras = 4;
	
	public Orden() {
		 this.idOrden = ++this.contadorOrdenes;
		 computadoras =new Computadora[maxComputadoras];
	}
	
	public void AgregarComputadora(Computadora computadora) {
		
		
		if(contadorComputadoras < maxComputadoras) {
			
			this.computadoras[contadorComputadoras++] = computadora;
			
		}else {
			System.out.println("Ya se ha sobrepasado del limite de computadoras permitidas");
		}
		
	}
	
	public void mostrarOrden() {
	
		for(int i = 0; i < contadorComputadoras; i++)
		{
		System.out.println("id Orden = "+idOrden+ "Computadora ="+computadoras[i]);
		}
		}
	
}
