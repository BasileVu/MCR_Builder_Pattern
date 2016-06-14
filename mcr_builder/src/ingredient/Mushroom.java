package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the mushrooms ingredient.
 */
public class Mushroom extends BurnableIngredient {
    public Mushroom() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
