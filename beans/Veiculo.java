package br.com.veiculo.beans;

public abstract class Veiculo {
	
	private String tipo;
	private String cor;
	
	public Veiculo(String tipo){
		setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
