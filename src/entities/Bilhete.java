package entities;

public abstract class Bilhete {

private Double valor;
	
	public Bilhete(Double valor) {
		this.valor = valor;
	}
	
	public abstract void hello();

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
