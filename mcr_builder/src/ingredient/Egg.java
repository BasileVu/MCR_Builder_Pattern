package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the egg ingredient.
 */
public class Egg extends BurnableIngredient {
    public Egg() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
