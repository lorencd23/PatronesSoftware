
package patron.concrete_builder;

import patron.abstract_builder.PizzaBuilder;

/**
 *
 * @author LorenzoGalveMuñoz
 */
public class HawaiiPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("Normal");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("Dulce");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("Pinha+York+Queso+Tomate");
    }
    
}
