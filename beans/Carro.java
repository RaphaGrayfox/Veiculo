package br.com.veiculo.beans;

public class Carro extends VeiculoTerrestre{

	public Carro(String tipo) {
		super(tipo);
	}
	
	private int quantidadeDePortas;

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
	
	
	

}
