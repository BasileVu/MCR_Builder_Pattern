package product;

import ingredient.Bread;
import ingredient.Ingredient;

import java.util.LinkedList;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Hamburger extends FoodProduct {
    public Hamburger(Bread b, LinkedList<Ingredient> ingredients) {
        super(b, ingredients);
    }
}
