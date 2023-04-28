import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // Array com a lista de candidatos
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        double valorBase = 2000.00;
        String[] candidatosSelecionados = new String[5];
        int k = 0;

        for (int i = 0; i < candidatos.length && k < 5; i++) {
            double valorPretendido = valorPretendido();

            if (valorBase > valorPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");
                candidatosSelecionados[k] = candidatos[i];
                k++;
            } else if (valorBase == valorPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
                candidatosSelecionados[k] = candidatos[i];
                k++;
            } else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            }
        }

        candidatosSelecionados = Arrays.stream(candidatosSelecionados)
                .filter(i -> (i != null && i.length() > 0))
                .toArray(String[]::new);

        System.out.println("--------------------------");
        System.out.println("Aqui está a lista do candidatos selecionados:");
        System.out.println(Arrays.toString(candidatosSelecionados));

        for (int i = 0; i < candidatosSelecionados.length; i++) {
            for (int t = 1; t <= 3; t++) {
                boolean ligacaoAtendida = ligacaoAtendida();
                if (ligacaoAtendida == true) {
                    System.out.println(
                            "Conseguimos contato com " + candidatosSelecionados[i] + "após " + t + "x tentativas.");
                    break;
                } else if (t == 3 && ligacaoAtendida == false) {
                    System.out.println("Não conseguimos contato com o(a) candidato(a) " + candidatosSelecionados[i]);
                }
            }

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean ligacaoAtendida() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}
