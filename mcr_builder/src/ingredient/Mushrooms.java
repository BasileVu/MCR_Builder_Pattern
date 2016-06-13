package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the mushrooms ingredient.
 */
public class Mushrooms extends BurnableIngredient {
    public Mushrooms() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
