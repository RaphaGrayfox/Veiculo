package br.com.veiculo.beans;

public class VeiculoTerrestre extends Veiculo{

	private String montadora;
	private int ano;
	
	public VeiculoTerrestre(String tipo) {
		super(tipo);
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
