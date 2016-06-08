package product;

import ingredient.Dough;
import ingredient.Ingredient;

import java.awt.*;
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

    public Image[] getImages() {
        Image[] res = new Image[ingredients.size() + 1];
        res[res.length-1] = ingredients.get(ingredients.size() - 1).getImage();

        res[0] = base.getImage();
        for (int i = 0; i < ingredients.size(); ++i) {
            res[i+1] = ingredients.get(i).getImage();
        }

        return res;
    }
}
