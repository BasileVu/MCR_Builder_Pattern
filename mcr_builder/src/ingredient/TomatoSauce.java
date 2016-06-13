package ingredient;

import gui.display.FoodDisplay;

/**
 * Created by sebbos on 13.06.2016.
 */
public class TomatoSauce extends Sauce {
    @Override
    public void accept(FoodDisplay display) {
        display.visit(this);
    }
}
