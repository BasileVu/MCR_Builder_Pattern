package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the pickle ingredient.
 */
public class Pickle extends BurnableIngredient {
    public Pickle() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
