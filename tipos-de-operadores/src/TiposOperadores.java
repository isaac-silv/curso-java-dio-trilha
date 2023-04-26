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

        // Operadores relacionais

        // == Quando desejamos verificar se uma variável é IGUAL A outra.
        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        // < Quando desejamos verificar se uma variável é MENOR QUE outra.
        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        // Operadores Logicos

        // Os operadores lógicos, representam o recurso que nos permite criar expressões
        // lógicas maiores, a partir da junção de duas ou mais expressões.
        // && Operador Lógico "E"
        // || Operador Lógico "OU"

        // Operadores.java
        boolean condicao1 = true;

        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
