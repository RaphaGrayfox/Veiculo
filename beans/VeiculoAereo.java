package br.com.veiculo.beans;

public class VeiculoAereo extends Veiculo{
	
	public VeiculoAereo(String tipo) {
		super(tipo);
	}
	
	private int quantidadeDeTurbinas;
	private int quantidadeDeRodas;
	
	public int getQuantidadeDeTurbinas() {
		return quantidadeDeTurbinas;
	}
	
	public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
		this.quantidadeDeTurbinas = quantidadeDeTurbinas;
	}
	
	public int getQuantidadeDeRodas() {
		return quantidadeDeRodas;
	}
	
	public void setQuantidadeDeRodas(int quantidadeDeRodas) {
		this.quantidadeDeRodas = quantidadeDeRodas;
	}
	
	
	

}
