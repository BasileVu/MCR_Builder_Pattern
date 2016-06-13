package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class Cheddar extends MeltableIngredient {
    public Cheddar() {
        super(2);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
