package entities;

public class Executivo extends Bilhete {
	
	public Executivo(Double valor) {
		super(valor);
	}
	
	public void hello() {
		System.out.println("Bilhete Executivo...");
	}
}