package apps;

public class Whastapp extends SistemaMensagens {
    public void enviarMensagem() {
        verificaConexao();
        System.out.println("Enviando mensagem pelo whatsapp");
    };

    public void receberMensagem() {

        System.out.println("Recebendo mensagem pelo whatsapp");
    }
}
