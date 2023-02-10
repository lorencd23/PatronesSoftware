
package threads01.factory;

import threads01.SoldierRunnable;
import threads01.Threads01;

/**
 * @author LorenzoGalveMuñoz
 */
public class FactoryThreads {
    public static final String COMANDANTE = "COMANDANTE";
    public static final String CENTURION = "CENTURION";
    public static final String SOLDADO = "SOLDADO";
    
    public static Thread getInstance(String tropaElegida){
        
        Thread thrd = null;
        
        switch(tropaElegida){
            case COMANDANTE:
                thrd = new Thread (new SoldierRunnable(), "COMANDANTE");
                break;
            case CENTURION:
                thrd = new Thread (new SoldierRunnable(), "CENTURION");
                break;
            case SOLDADO:
                thrd = new Thread (new SoldierRunnable(), "SOLDADO");
                break;
        }
        
        return thrd;
    }
    
}
