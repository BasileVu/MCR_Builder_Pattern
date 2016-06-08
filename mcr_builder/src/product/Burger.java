package product;

import ingredient.BreadBottom;
import ingredient.BreadTop;
import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Burger {
    private BreadBottom base;
    private BreadTop top;
    private final ArrayList<Ingredient> ingredients;

    public Burger(BreadBottom base, BreadTop top, ArrayList<Ingredient> ingredients) {
        this.base = base;
        this.top = top;
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        if (base == null) {
            return new Ingredient[0];
        }

        Ingredient[] res;
        if (top == null) {
            res = new Ingredient[ingredients.size() + 1];
        } else {
            res = new Ingredient[ingredients.size() + 2];
            res[res.length - 1] = top;
        }

        res[0] = base;
        for (int i = 0; i < ingredients.size(); ++i) {
            res[i+1] = ingredients.get(i);
        }

        return res;
    }
}
