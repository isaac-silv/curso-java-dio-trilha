package apps;

public class Telegram extends SistemaMensagens {

    public void enviarMensagem() {
        verificaConexao();
        System.out.println("Enviando mensagem pelo telegram");
    };

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    };
}
