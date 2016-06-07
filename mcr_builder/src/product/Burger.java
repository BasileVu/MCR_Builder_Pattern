package product;

import ingredient.Bread;
import ingredient.Ingredient;

import java.util.ArrayList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Burger extends FoodProduct {
    public Burger(Bread b, ArrayList<Ingredient> ingredients) {
        super(b, ingredients);
    }
}
