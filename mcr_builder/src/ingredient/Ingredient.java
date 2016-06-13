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

    /**
     * Gets the baking degree of this ingredient.
     * @return the baking degree.
     */
    public int getBakingDegree() {
        return bakingDegree;
    }

    /**
     * Used to display the ingredient in a representation defined in a FoodDisplay.
     * @param display The display using the ingredient.
     */
    public abstract void accept(FoodDisplay display);
}
