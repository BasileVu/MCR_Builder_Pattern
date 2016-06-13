package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the Basil ingredient.
 */
public class Basil extends BurnableIngredient {
    public Basil() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
