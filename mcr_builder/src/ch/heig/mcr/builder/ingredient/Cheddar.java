package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the cheddar ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Cheddar extends Cheese {
    public Cheddar() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
