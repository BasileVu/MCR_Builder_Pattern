package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the onion ingredient.
 */
public class Onion extends BurnableIngredient {
    public Onion() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
