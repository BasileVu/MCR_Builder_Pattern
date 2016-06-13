package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the tomato sauce ingredient.
 */
public class TomatoSauce extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
