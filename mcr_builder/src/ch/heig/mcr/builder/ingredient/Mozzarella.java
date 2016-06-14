package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the mozzarella ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Mozzarella extends Cheese {
    public Mozzarella() {
        super(1);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
