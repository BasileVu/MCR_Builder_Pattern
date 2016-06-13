package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the meat ingredient.
 */
public class Meat extends BurnableIngredient {
    public Meat() {
        super(4);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
