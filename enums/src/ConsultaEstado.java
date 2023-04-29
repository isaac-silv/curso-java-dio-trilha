public class ConsultaEstado {
    public static void main(String[] args) {

        for (EstadosNordeste en : EstadosNordeste.values()) {
            System.out.println("Nome " + en.getNome() + " - " + "Sigla " + en.getSigla());
        }
    }
}
