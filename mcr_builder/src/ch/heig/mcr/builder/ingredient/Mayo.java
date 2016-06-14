package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the mayonnaise ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Mayo extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
