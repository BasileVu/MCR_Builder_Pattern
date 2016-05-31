package director;

import builder.PizzaBuilder;
import ingredient.Cheese;
import ingredient.Onion;
import ingredient.Tomato;
import product.Pizza;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Pizzaiolo {

    // TODO change
    // for now it represents what we will input by the GUI. The GUI will probably be the director using the PizzaBuilder.
    public Pizza build() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.buildBase();
        builder.addIngredient(new Tomato());
        builder.addIngredient(new Cheese("Mozarella", 1));
        builder.addIngredient(new Onion());
        builder.bake();
        return builder.getPizza();
    }
}
