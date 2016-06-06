package builder;

import exceptions.MissingBaseException;
import ingredient.Dough;
import ingredient.Ingredient;
import product.Pizza;

import java.util.LinkedList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class PizzaBuilder extends FoodBuilder {

    private final LinkedList<Ingredient> ingredients = new LinkedList<>();
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
            ingredients.add(ingredient);
        }
        // TODO what to do if could not be added (animation on the GUI ?)
    }

    /**
     * Bakes the Pizza.
     *
     * For burnable ingredients, slightly burn them if they are not under a meltable topping.
     * For meltable ingredients, melt them.
     */
    @Override
    public void bake() {
        if (base != null) {
            base.bake();
        }

        for (Ingredient i: ingredients) {
            i.bake();
        }
    }

    public Pizza getPizza() throws MissingBaseException{
        if (base == null) {
            throw new MissingBaseException();
        }

        return new Pizza(base, ingredients);
    }
}
