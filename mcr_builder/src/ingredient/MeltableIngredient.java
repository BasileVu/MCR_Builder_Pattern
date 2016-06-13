package ingredient;

/**
 * Created by Basile Vu on 29.05.2016.
 */
public abstract class MeltableIngredient extends Ingredient {
    private int meltThreshold;

    public MeltableIngredient(int meltThreshold) {
        this.meltThreshold = meltThreshold;
    }

    public boolean isMelted() {
        return getBakingDegree() >= meltThreshold;
    }
}
