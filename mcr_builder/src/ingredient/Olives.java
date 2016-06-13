package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by sebbos on 13.06.2016.
 */
public class Olives extends BurnableIngredient {
    public Olives() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
