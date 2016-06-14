package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents a middle bread in a burger.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class MiddleBread extends BurgerBread {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
