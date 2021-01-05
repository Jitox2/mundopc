package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{


	private int idTeclado;
	private int contadorTeclados;
	
		public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++contadorTeclados;	
	}
		
		@Override
		public String toString(){
			return "id Teclado = "+this.idTeclado+super.toString();
		}
	}
