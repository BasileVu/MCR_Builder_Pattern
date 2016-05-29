package product;

import ingredient.Dough;
import ingredient.Ingredient;

import java.util.LinkedList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Pizza extends FoodProduct {
    public Pizza(Dough b, LinkedList<Ingredient> ingredients) {
        super(b, ingredients);
    }
}
