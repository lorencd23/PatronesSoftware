
package patron.abstract_builder;

/**
 *
 * @author LorenzoGalveMuñoz
 */

/*PRODUCTO QUE UTILIZARA EL BUILDER*/
public class Pizza {
    
    //ATRIBUTOS
    private String masa = "";
    private String salsa = "";
    private String relleno = "";

    //SETTERS
    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    
    
}
