package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the gruyere ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Gruyere extends Cheese {
    public Gruyere() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
