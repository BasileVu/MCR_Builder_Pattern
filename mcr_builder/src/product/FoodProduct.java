package product;

import ingredient.Ingredient;

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

}
