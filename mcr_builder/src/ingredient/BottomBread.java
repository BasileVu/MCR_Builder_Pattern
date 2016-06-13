package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class BottomBread extends BurnableIngredient {

    public BottomBread(int burnThreshold) {
        super(burnThreshold);
    }

    @Override
    public void accept(FoodDisplay display) {

    }
}
