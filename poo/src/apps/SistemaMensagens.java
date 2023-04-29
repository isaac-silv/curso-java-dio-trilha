package apps;

public abstract class SistemaMensagens {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void verificaConexao() {
        System.out.println("Verificando conexão com a internet");
    }
}
