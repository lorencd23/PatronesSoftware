
package patron;

import patron.abstract_builder.PizzaBuilder;
import patron.concrete_builder.BBQPizzaBuilder;
import patron.concrete_builder.HawaiiPizzaBuilder;
import patron.director.Cocina;

/**
 *
 * @author Lorenzo Galve Muñoz
 */
public class PatronBuilder {

    public static void main(String[] args) {
        
        /* Parte de Patron Singleton */
        Cocina cocina = Cocina.getInstance();   //Director
        
        //PATRON FACTORIA
        /* Parte de Patron Builder */
        //PizzaBuilder hawaianaPizza = new HawaiiPizzaBuilder();
        //PizzaBuilder barbacoaPizza = new BBQPizzaBuilder();
        //barbacoaPizza.buildRelleno();VINCULACION DINAMICA EJECUTA EL METODO DE LA CLASE HIJA
        
        PizzaBuilder hawaianaPizza = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.HAWAII_PIZZA);
        PizzaBuilder barbacoaPizza = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.BBQ_PIZZA);
        
        cocina.setPizzaBuilder(hawaianaPizza);
        cocina.construirPizza();
        
        cocina.setPizzaBuilder(barbacoaPizza);
        cocina.construirPizza();
    }
    
}
