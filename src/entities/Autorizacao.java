package entities;

public class Autorizacao {
    private static Autorizacao instance = null;
    
    private Autorizacao() {}
    
    public static synchronized Autorizacao getInstance() {
        if (instance == null) {
            instance = new Autorizacao();
        }
        return instance;
    }
    
    public void consultaCartao(CompradorCliente c, String codVoo) {
        System.out.println("Consultando dados do cartão do cliente " + c.getNome());
        if (c.getNome() != null) {
            System.out.println("Pagamento autorizado");
        } else {
            System.out.println("Informações inválidas");
        }
    }
    
    public void consultaCompanhiaAerea(String codVoo) {
        System.out.println("Verificando disponibilidade no Voo " + codVoo);
        if (codVoo != null) {
            System.out.println("Disponibilidade identificada");
        }
    }
}