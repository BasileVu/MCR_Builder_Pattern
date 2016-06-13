package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the mayonnaise ingredient.
 */
public class Mayo extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
