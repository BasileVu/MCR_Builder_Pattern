package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the ketchup ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Ketchup extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
