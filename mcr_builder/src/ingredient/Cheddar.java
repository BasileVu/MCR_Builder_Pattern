package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the cheddar ingredient.
 */
public class Cheddar extends Cheese {
    public Cheddar() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
