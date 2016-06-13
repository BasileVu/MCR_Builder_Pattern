package ingredient;

import gui.display.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class Tomato extends BurnableIngredient {
    public Tomato() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
