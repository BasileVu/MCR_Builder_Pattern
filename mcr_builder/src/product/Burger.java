package product;

import ingredient.Bread;
import ingredient.Dough;
import ingredient.Ingredient;

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

    // TODO
    // for now it prints all the ingredients, but we will probably have to remove this later
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(base.toString());
        for (Ingredient t: ingredients) {
            res.append(" ");
            res.append(t.toString());
        }

        if (top != null) {
            res.append(" ");
            res.append(top.toString());
        }

        return res.toString();
    }
}
