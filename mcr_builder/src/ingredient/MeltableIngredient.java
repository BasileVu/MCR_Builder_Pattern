package ingredient;

/**
 * Represents an ingredient that can melt.
 */
public abstract class MeltableIngredient extends Ingredient {
    private int meltThreshold;

    public MeltableIngredient(int meltThreshold) {
        this.meltThreshold = meltThreshold;
    }

    /**
     * Returns whether this ingredient is melted.
     * @return whether this ingredient is melted.
     */
    public boolean isMelted() {
        return getBakingDegree() >= meltThreshold;
    }
}
