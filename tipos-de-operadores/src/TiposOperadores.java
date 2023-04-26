public class TiposOperadores {
    public static void main(String[] args) throws Exception {
        // Tipos de Operadores

        // Operador de atribuição '='
        // Usado para atruibuir um valor em uma vaiável

        String nome = "Isaac"; // exemplo

        // Operadores aritimeticos
        // Adição '+'
        // Subtração '-'
        // Mutiplicação '*'
        // Divisão '/'

        // Exemplo
        int soma = 10 + 10;
        int subtracao = 20 - 10;
        int mutiplicacao = 3 * 10;
        double divisao = 40 / 3;

        // O operador '+' quando utilizado em uma variável do tipo texto realizará a
        // concatenação

        // Exemplo:
        String conca = 10 + "10"; // o resultado será '1010'

        // Operadores unário

        // (+) Operador unário de valor positivo – números são positivos sem esse
        // operador explicitamente;
        // (-) Operador unário de valor negativo – nega um número ou expressão
        // aritmética;
        // (++) Operador unário de incremento de valor – incrementa o valor em 1
        // unidade;
        // (--) Operador unário de decremento de valor – decrementa o valor em 1
        // unidade;
        // (!) Operador unário lógico de negação – nega o valor de uma expressão
        // booleana.

        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        // Operador ternário

        // O operador ternário é representado pelos símbolos "?" e ":"

        // Exemplo:

        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}
