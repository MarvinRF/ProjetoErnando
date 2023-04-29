package entities;

public class BilheteFactory {
	private BilheteFactory() {}
	
	public static Bilhete criarBilhete(String nome) {
		
		if(nome.equals("economico")) {
			return new Economico(200.00);
		
		} else if(nome.equals("executivo")) {
			return new Executivo(500.00);
		
		} else if(nome.equals("primeira")) {
			return new Primeira(800.00);
		
		} else {
			return null;
		}
		
	}
}
     
