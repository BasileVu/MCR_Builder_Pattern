package builder;

import exceptions.MissingBaseException;
import ingredient.Dough;
import ingredient.Ingredient;
import ingredient.MeltableIngredient;
import product.Pizza;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class PizzaBuilder {

    private final ArrayList<Ingredient> ingredients = new ArrayList<>();
    private Dough base;

    public void buildBase() {
        this.base = new Dough();
    }

    /**
     * Adds an ingredient on the Pizza.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
     */
    public void addIngredient(Ingredient ingredient) throws MissingBaseException {
        if (base == null) {
            // TODO what to do if could not be added (animation on the GUI ?)
            throw new MissingBaseException();
        }
        ingredients.add(ingredient);
    }

    /**
     * Bakes the Pizza.
     *
     * For burnable ingredients, slightly burn them if they are not under a meltable topping.
     * For meltable ingredients, melt them.
     */
    public void bake() {
        if (base != null) {
            base.bake();
        }

        boolean meltFound = false;
        for (int i = ingredients.size() - 1; i >= 0; --i) {

            if (meltFound) {
                ingredients.get(i).safeBake();
            } else {
                ingredients.get(i).bake();
            }

            if (ingredients.get(i) instanceof MeltableIngredient) {
                meltFound = true;
            }
        }
    }

    public Pizza getProgress() {
        return new Pizza(base, ingredients);
    }

    public Pizza getPizza() throws MissingBaseException {
        if (base == null) {
            throw new MissingBaseException();
        }

        return new Pizza(base, ingredients);
    }
}
