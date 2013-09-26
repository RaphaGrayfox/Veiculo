package br.com.veiculo.beans;

public class Moto extends VeiculoTerrestre{

	public Moto(String tipo) {
		super(tipo);
		
	}
	
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	

}
