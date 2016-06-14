package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the tomato sauce ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class TomatoSauce extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
