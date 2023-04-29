package entities;

public class ConfeccaoBilhete {
	
	public static void gerarBilheteImpresso(CompradorCliente c, String codVoo) {
		System.out.println("Buscando impressoras disponíveis....");
		System.out.println("Imprimindo o(s) bilhete(s) para o comprador " + c.getNome() + " e voo " + codVoo);	
	}
}