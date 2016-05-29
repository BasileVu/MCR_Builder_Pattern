package builder;

import ingredient.Dough;
import ingredient.Ingredient;
import product.Pizza;

import java.util.LinkedList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class PizzaBuilder extends FoodBuilder {

    private final LinkedList<Ingredient> toppings = new LinkedList<>();
    private Dough base;

    @Override
    public void buildBase() {
        this.base = new Dough();
    }


    /**
     * Adds an ingredient on the Pizza.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
     */
    @Override
    public void addIngredient(Ingredient ingredient) {
        if (base != null) {
            toppings.add(ingredient);
        }
        // TODO what to do if could not be added (animation on the GUI ?)
    }

    /**
     * Bakes the Pizza.
     *
     * For burnable toppings, slightly burn them if they are not under a meltable topping.
     * For meltable toppings, melt them.
     */
    @Override
    public void bake() {
        // TODO
    }

    public Pizza getPizza() {
        if (base != null) {
            // TODO
        }

        return new Pizza(base, toppings);
    }
}
