package ingredient;

/**
 * Represents an ingredient that can burn.
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
