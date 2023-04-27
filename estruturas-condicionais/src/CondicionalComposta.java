public class CondicionalComposta {
    public static void main(String[] args) {
        // Algumas vezes, o nosso programa deverá seguir mais de uma jornada de
        // execução, condionado a uma regra de negócio, este cenário é demoninado
        // Estrutura Condicional Composta.

        // Exemplo - Média escolar

        int nota1 = 8;
        int nota2 = 6;

        int media = nota1 + nota2 / 2;

        if (media >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");

    }
}
