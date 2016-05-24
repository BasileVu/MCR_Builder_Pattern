package builder;

import ingredient.Base;
import ingredient.Ingredient;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public abstract class FoodBuilder {

    private final List<Ingredient> ingredients = new LinkedList<Ingredient>();
    private Base base;

    public void buildBase(Base b) {
        this.base = b;
    }

    /**
     * Bakes the product.
     *
     * For burnable toppings, slightly burn them if they are not under a meltable topping.
     * For meltable toppings, melt them.
     */
    public void bake() {
        // TODO
    }

    /**
     * Adds an ingredient on the product.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
     */
    public void addIngredient(Ingredient ingredient) {
        if (base != null) {
            ingredients.add(ingredient);
        }
        // TODO what to do if could not be added
    }
}
