package product;

import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Pizza {
    private final Ingredient base;
    private final ArrayList<Ingredient> ingredients;

    public Pizza(Ingredient base, ArrayList<Ingredient> ingredients) {
        this.base = base;
        this.ingredients = ingredients;
    }
}
