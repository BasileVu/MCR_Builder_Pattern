package product;

import ingredient.BottomBread;
import ingredient.Ingredient;
import ingredient.TopBread;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Burger {
    private BottomBread base;
    private TopBread top;
    private final ArrayList<Ingredient> ingredients;

    public Burger(BottomBread base, TopBread top, ArrayList<Ingredient> ingredients) {
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
