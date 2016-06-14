package ch.heig.mcr.builder.builder;

import ch.heig.mcr.builder.exceptions.BaseAlreadyCreatedException;
import ch.heig.mcr.builder.ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Represents the builder used to build food.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
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

    /**
     * Reinitialize the content of the specific FoodBuilder (PizzaBuilder or BurgerBuilder)
     */
    public void reset() {}
}
