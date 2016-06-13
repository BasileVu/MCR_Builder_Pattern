package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
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
