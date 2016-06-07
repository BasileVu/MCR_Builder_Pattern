package product;

import ingredient.BurnableIngredient;
import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class FoodProduct {
    private final BurnableIngredient base;
    private final ArrayList<Ingredient> ingredients;

    public FoodProduct(BurnableIngredient base, ArrayList<Ingredient> ingredients) {
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
