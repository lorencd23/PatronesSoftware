package patron_adapter;

/**
 * @author LorenzoGalveMuñoz
 */
public class PATRON_ADAPTER {

    public static void main(String[] args) {
        Conectable lampara = new Lampara();
        Conectable ordenador = new Ordenador();
        
        encenderAparato(lampara);
        encenderAparato(ordenador);
        
        /*
        lampara.encender();
        System.out.println("Está encendida: " + lampara.isEncendida());
        ordenador.encender();
        System.out.println("Está encendida: " + ordenador.isEncendida());
        */
    }
    
    private static void encenderAparato(Conectable l1){
        l1.encender();
        System.out.println(l1.isEncendida());
    }
    
}
