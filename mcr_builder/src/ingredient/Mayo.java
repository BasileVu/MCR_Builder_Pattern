package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class Mayo extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
