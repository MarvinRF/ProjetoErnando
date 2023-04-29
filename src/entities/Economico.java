package entities;

public class Economico extends Bilhete {
	
	public Economico(Double valor) {
		super(valor);
	}
	
	public void hello() {
		System.out.println("Bilhete Econômico...");
	}
}