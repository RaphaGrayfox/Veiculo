package br.com.veiculo.impl;

import br.com.veiculo.beans.Carro;
import br.com.veiculo.inter.VeiculoINT;

public class ImplementaCarro extends Carro implements VeiculoINT{

	public ImplementaCarro(String tipo) {
		super(tipo);
	}

	@Override
	public void ligar() {
		System.out.println("Carro Ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Carro Desligando"); 
		
	}
	
}
