public class CondicionalTernaria {
    public static void main(String[] args) {
        int nota1 = 6;
        int nota2 = 6;

        int media = (nota1 + nota2) / 2;
        System.out.println(media);

        String resultado = media >= 7 ? "Aprovado" : media >= 5 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
