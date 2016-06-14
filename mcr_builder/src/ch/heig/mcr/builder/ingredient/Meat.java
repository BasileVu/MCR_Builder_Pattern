package ch.heig.mcr.builder.ingredient;

import ch.heig.mcr.builder.gui.display.FoodDisplay;

/**
 * Represents the meat ingredient.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class Meat extends BurnableIngredient {
    public Meat() {
        super(4);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
