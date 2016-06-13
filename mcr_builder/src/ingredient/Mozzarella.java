package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by sebbos on 13.06.2016.
 */
public class Mozzarella extends MeltableIngredient {
    public Mozzarella() {
        super(1);
    }

    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
