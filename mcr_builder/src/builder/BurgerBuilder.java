package builder;

import exceptions.MissingBaseException;
import exceptions.MissingTopException;
import exceptions.TopAlreadyPlacedException;
import ingredient.Ingredient;
import product.Burger;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class BurgerBuilder {
    private Ingredient base;
    private Ingredient top;
    private final ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void buildBase(Ingredient base) {
        this.base = base;
    }

    public void buildTop(Ingredient top) throws MissingBaseException {
        if (base == null) {
            throw new MissingBaseException();
        }
        this.top = top;
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

    /**
     * Bakes the Burger.
     *
     * For burnable ingredients, slightly burn them if they are not under a meltable topping.
     * For meltable ingredients, melt them.
     */
    public void bake() {
        if (base != null) {
            base.bake();
        }

        if (top != null) {
            top.bake();
        }

        for (Ingredient i: ingredients) {
            i.safeBake();
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
