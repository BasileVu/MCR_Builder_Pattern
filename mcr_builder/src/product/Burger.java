package product;

import ingredient.BottomBread;
import ingredient.Ingredient;
import ingredient.TopBread;

import java.util.ArrayList;

/**
 * Represents a burger.
 */
public class Burger extends FoodProduct {
    private BottomBread base;
    private TopBread top;

    public Burger(BottomBread base, TopBread top, ArrayList<Ingredient> ingredients) {
        this.base = base;
        this.top = top;
        this.ingredients = init(ingredients);
    }

    @Override
    protected Ingredient[] init(ArrayList<Ingredient> ingredients) {
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
