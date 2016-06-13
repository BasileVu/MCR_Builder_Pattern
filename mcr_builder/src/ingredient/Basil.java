package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by sebbos on 13.06.2016.
 */
public class Basil extends BurnableIngredient {
    public Basil() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
