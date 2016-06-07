package builder;

import exceptions.MissingBaseException;
import exceptions.MissingTopException;
import ingredient.Bread;
import ingredient.Ingredient;
import product.Burger;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class BurgerBuilder extends FoodBuilder {
    private final ArrayList<Ingredient> ingredients = new ArrayList<>();
    private Bread base, top;

    @Override
    public void buildBase() {
        this.base = new Bread();
    }

    public void buildTop() {
        this.top = new Bread();
    }

    /**
     * Adds an ingredient on the Hamburger.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
     */
    @Override
    public void addIngredient(Ingredient ingredient) {
        if (base != null) {
            ingredients.add(ingredient);
        }
    }

    /**
     * Bakes the Hamburger.
     *
     * For burnable ingredients, slightly burn them if they are not under a meltable topping.
     * For meltable ingredients, melt them.
     */
    @Override
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

    public Burger getHamburger() throws MissingBaseException, MissingTopException {
        if (base == null) {
            throw new MissingBaseException();
        }

        if (top == null) {
            throw new MissingTopException();
        }

        return new Burger(base, ingredients);
    }
}
