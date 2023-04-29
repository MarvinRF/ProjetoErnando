package entities;


public class ClienteSoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompradorCliente c = new CompradorCliente("123", "João da Silva");
		
		Venda v = new Venda();
		
		String codVoo = "Gol BR 51289";
		String tipoBilhete = "executivo";
		
		v.iniciarVenda(c, codVoo, tipoBilhete);
		
		String codVoo1 = "TAP BR 676";
		String tipoBilhete1 = "primeira";
		
		v.iniciarVenda(c, codVoo1, tipoBilhete1);
	}

}
        //classe criada conforme a solicitação do professor para a resolução da questão!