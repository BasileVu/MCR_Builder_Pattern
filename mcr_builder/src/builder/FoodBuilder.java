package builder;

import exceptions.BaseAlreadyCreatedException;
import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Represents the builder used to build food.
 */
public abstract class FoodBuilder {

    protected ArrayList<Ingredient> ingredients = new ArrayList<>();

    /**
     * Builds the base of the product.
     *
     * @throws BaseAlreadyCreatedException
     */
    public void buildBase() throws BaseAlreadyCreatedException {}

    /**
     * Bakes the food.
     *
     * For burnable ingredients, slightly burn them if they are not under a meltable topping.
     * For meltable ingredients, melt them.
     */
    public void bake() {}
}
