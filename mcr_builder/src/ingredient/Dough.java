package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the Dough of a pizza.
 */
public class Dough extends BurnableIngredient {
    public Dough() {
        super(4);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
