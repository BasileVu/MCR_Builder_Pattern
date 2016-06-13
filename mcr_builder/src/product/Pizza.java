package product;

import ingredient.Dough;
import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Pizza {
    private final Dough base;
    private final ArrayList<Ingredient> ingredients;

    public Pizza(Dough base, ArrayList<Ingredient> ingredients) {
        this.base = base;
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
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
