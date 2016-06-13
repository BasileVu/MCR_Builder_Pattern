package product;

import ingredient.Dough;
import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Represents a pizza.
 */
public class Pizza extends FoodProduct{
    private final Dough base;

    public Pizza(Dough base, ArrayList<Ingredient> ingredients) {
        this.base = base;
        this.ingredients = init(ingredients);
    }

    @Override
    protected Ingredient[] init(ArrayList<Ingredient> ingredients) {
        if (base == null) {
            return new Ingredient[0];
        }

        Ingredient[] res = new Ingredient[ingredients.size() + 1];

        res[0] = base;

        for (int i = 0; i < ingredients.size(); ++i) {
            res[i+1] = ingredients.get(i);
        }
        return res;
    }
}
