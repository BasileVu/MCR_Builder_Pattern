package ingredient;

/**
 * Created by Basile Vu on 29.05.2016.
 */
public abstract class BurnableIngredient extends Ingredient {
    private int burnThreshold;

    public BurnableIngredient(int burnThreshold) {
        this.burnThreshold = burnThreshold;
    }

    public boolean isBurned() {
        return getBakingDegree() >= burnThreshold;
    }
}
