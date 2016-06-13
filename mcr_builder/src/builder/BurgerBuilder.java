package builder;

import exceptions.*;
import ingredient.BottomBread;
import ingredient.Ingredient;
import ingredient.TopBread;
import product.Burger;

/**
 * Represents the builder used to build burgers.
 */
public class BurgerBuilder extends FoodBuilder {
    private BottomBread base;
    private TopBread top;

    /**
     * Builds the base of the burger.
     *
     * @throws BaseAlreadyCreatedException
     */
    public void buildBase() throws BaseAlreadyCreatedException {
        if (base != null) {
            throw new BaseAlreadyCreatedException();
        }
        base = new BottomBread();
    }

    /**
     * Builds the top of the burger.
     *
     * @throws MissingBaseException
     * @throws TopAlreadyCreatedException
     */
    public void buildTop() throws MissingBaseException, TopAlreadyCreatedException {
        if (base == null) {
            throw new MissingBaseException();
        }

        if (top != null) {
            throw new TopAlreadyCreatedException();
        }

        this.top = new TopBread();
    }


    /**
     * Adds an ingredient in the burger.
     *
     * @param ingredient The ingredient to add.
     * @throws MissingBaseException
     * @throws TopAlreadyPlacedException
     */
    public void addIngredient(Ingredient ingredient) throws MissingBaseException, TopAlreadyPlacedException {
        if (base == null) {
            throw new MissingBaseException();
        } else if (top != null) {
            throw new TopAlreadyPlacedException();
        }
        ingredients.add(ingredient);
    }

    @Override
    public void bake() {
        if (base != null) {
            base.bake();
        }

        if (top != null) {
            top.bake();
        }

        for (Ingredient i: ingredients) {
            i.bake();
        }
    }

    /**
     * Gets the temporary burger (used for the display in GUI).
     * @return The temporary burger.
     */
    public Burger getProgress() {
        return new Burger(base, top, ingredients);
    }

    /**
     * Gets the burger built (used for the display in GUI).
     * @return The burger built.
     */
    public Burger getBurger() throws MissingBaseException, MissingTopException {
        if (base == null) {
            throw new MissingBaseException();
        } else if (top == null) {
            throw new MissingTopException();
        }

        return new Burger(base, top, ingredients);
    }
}
