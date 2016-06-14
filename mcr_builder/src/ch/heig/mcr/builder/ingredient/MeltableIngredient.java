package ch.heig.mcr.builder.ingredient;

/**
 * Represents an ingredient that can melt.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
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
