package ingredient;

/**
 * Represents an ingredient that is a cheese.
 */
public abstract class Cheese extends MeltableIngredient {
    public Cheese(int meltThreshold) {
        super(meltThreshold);
    }
}
