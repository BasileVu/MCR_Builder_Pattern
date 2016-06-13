package product;

import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Represents a food product composed of various ingredients in a given order.
 */
public abstract class FoodProduct {
    protected Ingredient[] ingredients;

    /**
     * Returns all the ingredients in the product.
     * @return
     */
    public Ingredient[] getIngredients() {
        return ingredients;
    }

    /**
     * Initializes the various ingredients (the same array that will be get with getIngredients).
     *
     * @param ingredients The ingredients from which the array will be constructed.
     * @return the ingredients in an array.
     */
    protected abstract Ingredient[] init(ArrayList<Ingredient> ingredients);

}
