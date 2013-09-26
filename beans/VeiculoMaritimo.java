package br.com.veiculo.beans;

public class VeiculoMaritimo extends Veiculo{

	public VeiculoMaritimo(String tipo) {
		super(tipo);
		
	}
	
	private int tamanho; //em pés

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
