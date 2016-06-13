package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the bottom bread of a burger.
 */
public class BottomBread extends BurgerBread {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
