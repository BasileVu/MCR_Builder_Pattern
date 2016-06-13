package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the tomato ingredient.
 */
public class Tomato extends BurnableIngredient {
    public Tomato() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
