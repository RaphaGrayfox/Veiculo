package br.com.veiculo.beans;

public class Lancha extends VeiculoMaritimo{

	public Lancha(String tipo) {
		super(tipo);
	}
	
	private double velocidade;

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
