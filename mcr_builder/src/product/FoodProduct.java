package product;

import ingredient.Base;
import ingredient.Ingredient;

import java.util.LinkedList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class FoodProduct {
    private final Base base;
    private final LinkedList<Ingredient> ingredients;

    public FoodProduct(Base base, LinkedList<Ingredient> ingredients) {
        this.base = base;
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
        return res.toString();
    }
}
