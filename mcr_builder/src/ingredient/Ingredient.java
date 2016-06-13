package ingredient;

import gui.display.FoodDisplay;

/**
 * Represents an Ingredient used to build food.
 */
public abstract class Ingredient {

    private int bakingDegree = 0;

    /**
     * Bakes the ingredient.
     */
    public void bake() {
        bakingDegree++;
    }

    public int getBakingDegree() {
        return bakingDegree;
    }

    public abstract void accept(FoodDisplay display);
}
