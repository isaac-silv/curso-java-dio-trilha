package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void Imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    public void Digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void Copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

}
