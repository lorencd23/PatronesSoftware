
package patron.concrete_builder;

import patron.abstract_builder.PizzaBuilder;

/**
 *
 * @author LorenzoGalveMuñoz
 */
public class BBQPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("Gruesa");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("Barbacoa con cerveza");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("Bacon+CarnePicada+Tomate+Jalapenhos");
    }
    
}
