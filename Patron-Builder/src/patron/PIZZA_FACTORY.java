package patron;

import patron.abstract_builder.PizzaBuilder;
import patron.concrete_builder.BBQPizzaBuilder;
import patron.concrete_builder.HawaiiPizzaBuilder;

/**
 * @author LorenzoGalveMuñoz
 */

/*PATRONES DE SOFTWARE*/
/*
    BACKEND
        *STATE
        *STRATEGY
        *ADAPTER
        *DAO
*/
/*
    PRINCIPIOS SOLID
    INYECCION DE DEPENDENCIA
*/
/*
    JSON
        *PUBLICAR EN WEBSERVICE REST
*/
/*
    ANDROID
        *ITERATOR
        *FACADE
        *OBSERVER
*/


public class PIZZA_FACTORY {
    
    public final static int HAWAII_PIZZA = 1;
    public final static int BBQ_PIZZA = 2;
    
    public static PizzaBuilder getInstance(int pizzaSelected){
        PizzaBuilder pizza = null;
        
        switch(pizzaSelected){
            case HAWAII_PIZZA:
                pizza =  new HawaiiPizzaBuilder();
                break;
            case BBQ_PIZZA:
                pizza = new BBQPizzaBuilder();
                break;
            //default o varios cases
        }
        
        return pizza;
    }
    
}
