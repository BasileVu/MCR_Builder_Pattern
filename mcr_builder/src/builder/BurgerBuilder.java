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

    public void buildBase() throws BaseAlreadyCreatedException {
        if (base != null) {
            throw new BaseAlreadyCreatedException();
        }
        base = new BottomBread();
    }

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
     * Adds an ingredient on the Burger.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
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

    public Burger getProgress() {
        return new Burger(base, top, ingredients);
    }

    public Burger getBurger() throws MissingBaseException, MissingTopException {
        if (base == null) {
            throw new MissingBaseException();
        } else if (top == null) {
            throw new MissingTopException();
        }

        return new Burger(base, top, ingredients);
    }
}
