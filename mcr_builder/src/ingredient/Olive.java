package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the olives ingredient.
 */
public class Olive extends BurnableIngredient {
    public Olive() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
