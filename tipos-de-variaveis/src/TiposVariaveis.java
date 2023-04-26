public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Variáveis primitivas

        byte idade = 18; // valor máximo 127 - valor mínimo -128
        short ano = 2023; // valor máximo 32.767 - valor mínimo -32.768
        int cep = 58059777; // valor máximo 2.147.483.647 - valor mínimo -2.147.483.648
        long cpf = 12345678900L; // valor máximo 9.223.372.036.854.775.807 - valor mínmo
                                 // -9.223.372.036.854.775.808
        // Os valores do tipo long precisam terminar com L

        float altura = 1.75F; // Valor máximo 6 - 7 dígitos
        // Os valores do tipo float precisam terminar com F
        double salario = 2500.99; // valor máximo 15 dígitos

        // Para declarar uma constante deve usar a palavra reservada "final" antes de
        // declarar o tipo da variável
        // As constantes devem ser escritas em CAIXA ALTA

        final double VALOR_DE_PI = 3.14;
    }
}
