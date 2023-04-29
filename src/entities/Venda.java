package entities;

public class Venda {
	
	private Autorizacao SistemaAut;
	private ConfeccaoBilhete SistemaConf;
	private Comunicacao SistemaComunicacao;
	
	public void iniciarVenda(CompradorCliente c, String codVoo, String tipoBilhete) {
		
		SistemaAut = Autorizacao.getInstance();
		System.out.println("##############");
		
		SistemaAut.consultaCompanhiaAerea(codVoo);
		SistemaAut.consultaCartao(c, codVoo);
		
		Bilhete bilheteTipo = BilheteFactory.criarBilhete(tipoBilhete);
		bilheteTipo.hello();
		
		System.out.println("Total R$ " + bilheteTipo.getValor());
		System.out.println("##############");
		
		SistemaConf.gerarBilheteImpresso(c, codVoo);
		
		System.out.println("##############");
		
		SistemaComunicacao.enviarEmail(c, codVoo);
		SistemaComunicacao.enviarSms(c, codVoo);
		
		System.out.println("##############");
	}
	
}