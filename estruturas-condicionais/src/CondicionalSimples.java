public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        // Quando ocorre uma validação de execução de fluxo, somente quando a condição
        // for positiva, consideramos como uma estrutura Simples

        // Exemplo

        int saldo = 200;
        int preco = 150;

        if (preco < saldo)
            saldo = saldo - preco;

        System.out.println(saldo);
    }
}
