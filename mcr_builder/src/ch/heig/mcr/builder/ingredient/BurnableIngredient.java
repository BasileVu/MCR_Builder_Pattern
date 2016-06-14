package ch.heig.mcr.builder.ingredient;

/**
 * Represents an ingredient that can burn.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
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
