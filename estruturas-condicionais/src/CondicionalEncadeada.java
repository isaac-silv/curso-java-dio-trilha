public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 6;

        int media = (nota1 + nota2) / 2;

        if (media >= 7)
            System.out.println("Aprovado");

        else if (media >= 5 && media < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
    }
}
