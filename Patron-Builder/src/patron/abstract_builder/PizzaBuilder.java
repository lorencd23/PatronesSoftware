
package patron.abstract_builder;

/**
 *
 * @author LorenzoGalveMuñoz
 */
public abstract class PizzaBuilder {
    //ATRIBUTOS
    protected Pizza pizza;
    
    public Pizza getPizza(){
        return this.pizza;
    }
    
    public void crearNuevaPizza(){
        this.pizza = new Pizza();
    }
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
