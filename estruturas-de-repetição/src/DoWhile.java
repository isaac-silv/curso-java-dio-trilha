import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {

        } while (discando());

        System.out.println("Alô!");
    }

    private static boolean discando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?" + atendeu);

        return !atendeu;
    }
}
