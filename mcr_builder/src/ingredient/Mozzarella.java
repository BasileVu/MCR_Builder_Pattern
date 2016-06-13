package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the mozzarella ingredient.
 */
public class Mozzarella extends Cheese {
    public Mozzarella() {
        super(1);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
