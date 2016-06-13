package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents the top bread of a burger.
 */
public class TopBread extends BurgerBread {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
