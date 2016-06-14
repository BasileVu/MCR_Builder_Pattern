package ch.heig.mcr.builder.builder;

import ch.heig.mcr.builder.exceptions.BaseAlreadyCreatedException;
import ch.heig.mcr.builder.exceptions.MissingBaseException;
import ch.heig.mcr.builder.ingredient.Dough;
import ch.heig.mcr.builder.ingredient.Ingredient;
import ch.heig.mcr.builder.ingredient.MeltableIngredient;
import ch.heig.mcr.builder.product.Pizza;

/**
 * Represents the builder used to build pizzas.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class PizzaBuilder extends FoodBuilder {
    private Dough base;

    @Override
    public void buildBase() throws BaseAlreadyCreatedException {
        if (base != null) {
            throw new BaseAlreadyCreatedException();
        }

        this.base = new Dough();
    }

    /**
     * Adds an ingredient on the Pizza.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
     */
    public void addIngredient(Ingredient ingredient) throws MissingBaseException {
        if (base == null) {
            throw new MissingBaseException();
        }
        ingredients.add(ingredient);
    }

    /**
     * Bakes the ingredients. If a meltable ingredient is there, all the burnable ingredients (except base) under it
     * cannot be burned.
     */
    @Override
    public void bake() {
        if (base != null) {
            base.bake();
        }

        boolean meltFound = false;
        for (int i = ingredients.size() - 1; i >= 0; --i) {

            if (!meltFound) {
               ingredients.get(i).bake();
            }

            if (ingredients.get(i) instanceof MeltableIngredient) {
                meltFound = true;
            }
        }
    }

    /**
     * Gets the temporary pizza (used for the display in GUI).
     * @return The temporary pizza.
     */
    public Pizza getProgress() {
        return new Pizza(base, ingredients);
    }

    /**
     * Gets the pizza built (used for the display in GUI).
     * @return The pizza built.
     */
    public Pizza getPizza() throws MissingBaseException {
        if (base == null) {
            throw new MissingBaseException();
        }

        return new Pizza(base, ingredients);
    }

    @Override
    public void reset() {
        base = null;
        ingredients.clear();
    }
}
