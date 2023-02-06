package patron_adapter;

/**
 * @author LorenzoGalveMuñoz
 */
public class LamparaInglesa {
    private boolean isOn;
    
    public boolean isOn(){
        return this.isOn;
    }
    
    public void on(){
        this.isOn = true;
    }
    public void off(){
        this.isOn = false;
    }
    
}
