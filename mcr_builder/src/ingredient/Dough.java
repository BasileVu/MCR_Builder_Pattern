package ingredient;

import gui.display.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
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
