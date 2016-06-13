package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the salad ingredient.
 */
public class Salad extends BurnableIngredient {
    public Salad() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
