package br.com.veiculo.impl;

import br.com.veiculo.beans.Aviao;
import br.com.veiculo.inter.VeiculoINT;

public class ImplementaAviao extends Aviao implements VeiculoINT{

	public ImplementaAviao(String tipo) {
		super(tipo);
	}

	@Override
	public void ligar() {
		System.out.println("Aviao Ligado");
		
	}

	@Override
	public void desligar() {
		System.out.println("Aviao Desligado");
		
	}
	
	

}
