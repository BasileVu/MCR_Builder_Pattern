package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents a middle bread in a burger.
 */
public class MiddleBread extends BurgerBread {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
