package ch.heig.mcr.builder.product;

import ch.heig.mcr.builder.ingredient.BottomBread;
import ch.heig.mcr.builder.ingredient.Ingredient;
import ch.heig.mcr.builder.ingredient.TopBread;

import java.util.ArrayList;

/**
 * Represents a burger.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
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
