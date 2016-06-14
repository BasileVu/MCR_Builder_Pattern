package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the Dough of a pizza.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Dough extends BurnableIngredient {
    public Dough() {
        super(4);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
