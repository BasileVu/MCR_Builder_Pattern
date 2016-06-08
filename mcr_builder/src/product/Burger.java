package product;

import ingredient.Bread;
import ingredient.Ingredient;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Burger {
    private final Bread base, top;
    private final ArrayList<Ingredient> ingredients;

    public Burger(Bread base, Bread top, ArrayList<Ingredient> ingredients) {
        this.base = base;
        this.top = top;
        this.ingredients = ingredients;
    }

    public Image[] getImages() {
        if (base == null) {
            return new Image[0];
        }

        Image[] res;
        if (top != null) {
            res = new Image[ingredients.size() + 1];
        } else {
            res = new Image[ingredients.size() + 2];

            if (ingredients.size() > 0) {
                res[res.length - 1] = ingredients.get(ingredients.size() - 1).getImage();
            }
        }

        res[0] = base.getImage();
        for (int i = 0; i < ingredients.size(); ++i) {
            res[i+1] = ingredients.get(i).getImage();
        }

        return res;
    }
}
