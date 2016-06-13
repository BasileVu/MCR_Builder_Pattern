package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the ketchup ingredient.
 */
public class Ketchup extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
