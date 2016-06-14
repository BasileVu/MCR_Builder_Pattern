package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the bottom bread of a burger.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class BottomBread extends BurgerBread {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
