package patron_adapter;

/**
 * @author LorenzoGalveMuñoz
 */
public class Lampara implements Conectable{
    private boolean encendida;
    
    @Override
    public boolean isEncendida(){
        return this.encendida;
    }
    @Override
    public void encender(){
        this.encendida = true;
    }
    @Override
    public void apagar(){
        this.encendida = false;
    }
    
}
