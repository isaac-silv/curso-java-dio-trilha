public class SistemaMensagens {
    public void enviarMensagem() {
        verificaConexao();
        System.out.println("Mensagem enviada");
        salvarMensagens();
    }

    public void receberMensagem() {
        System.out.println("Nova mensagem recebida");
    }

    private void verificaConexao() {
    };

    private void salvarMensagens() {
    };

}
