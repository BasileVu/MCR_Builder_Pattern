package builder;

import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public abstract class FoodBuilder {

    protected ArrayList<Ingredient> ingredients = new ArrayList<>();

    /**
     * Bakes the product.
     *
     * For burnable ingredients, slightly burn them if they are not under a meltable topping.
     * For meltable ingredients, melt them.
     */
    public void bake() {}
}
