package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the olives ingredient.
 */
public class Olives extends BurnableIngredient {
    public Olives() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
