import apps.Telegram;
import apps.Whastapp;

public class AparelhoCelular {
    public static void main(String[] args) {
        System.out.println("Whatsapp");

        Whastapp wa = new Whastapp();
        wa.enviarMensagem();
        wa.receberMensagem();

        System.out.println("Telegram");
        Telegram tl = new Telegram();
        tl.enviarMensagem();
        tl.receberMensagem();
    }
}
