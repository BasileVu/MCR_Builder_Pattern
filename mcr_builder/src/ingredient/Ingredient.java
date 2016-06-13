package ingredient;

import gui.visitor.FoodDisplay;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public abstract class Ingredient {

    private int bakingDegree = 0;

    public void bake() {}

    public void safeBake() {
        bakingDegree++;
    }

    public int getBakingDegree() {
        return bakingDegree;
    }

    public abstract void accept(FoodDisplay display);
}
