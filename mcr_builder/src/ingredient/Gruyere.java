package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the gruyere ingredient.
 */
public class Gruyere extends Cheese {
    public Gruyere() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
