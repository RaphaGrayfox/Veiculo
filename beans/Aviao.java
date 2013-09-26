package br.com.veiculo.beans;

public class Aviao extends VeiculoMaritimo{

	public Aviao(String tipo) {
		super(tipo);
	}
	
	private String comanhiaAerea;

	public String getComanhiaAerea() {
		return comanhiaAerea;
	}

	public void setComanhiaAerea(String comanhiaAerea) {
		this.comanhiaAerea = comanhiaAerea;
	}
	
	

}
