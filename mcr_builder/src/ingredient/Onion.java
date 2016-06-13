package ingredient;

import gui.display.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class Onion extends BurnableIngredient {
    public Onion() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
