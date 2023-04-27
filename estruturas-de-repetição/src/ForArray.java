public class ForArray {
    public static void main(String[] args) {
        String diasSemana[] = {
                "Domingo",
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado"
        };

        for (int x = 0; x < diasSemana.length; x++) {
            System.out.println("O indice do(a) " + diasSemana[x] + " é " + x);
        }

        // Outro exemplo de loop em array

        for (String dia : diasSemana) {
            System.out.println(dia);
        }
    }
}
