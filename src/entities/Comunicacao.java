package entities;

public class Comunicacao {

	public static void enviarEmail(CompradorCliente c, String codVoo) {
		System.out.println("Enviando Email para " + c.getNome() + " com os dados do Voo " + codVoo);
	}

	public static void enviarSms(CompradorCliente c, String codVoo) {
		System.out.println("Enviando SMS para " + c.getNome() + " com os dados do Voo " + codVoo);
	}
}
