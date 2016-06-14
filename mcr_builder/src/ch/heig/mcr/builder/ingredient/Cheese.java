package ch.heig.mcr.builder.ingredient;

/**
 * Represents an ingredient that is a cheese.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public abstract class Cheese extends MeltableIngredient {
    public Cheese(int meltThreshold) {
        super(meltThreshold);
    }
}
