package patron_adapter;

/**
 * @author LorenzoGalveMuñoz
 */
public class AdaptadorLampara implements Conectable{

    private LamparaInglesa lInglesa = new LamparaInglesa();
    
    @Override
    public boolean isEncendida() {
        return this.lInglesa.isOn();
    }

    @Override
    public void encender() {
        this.lInglesa.on();
    }

    @Override
    public void apagar() {
        this.lInglesa.off();
    }
    
}
