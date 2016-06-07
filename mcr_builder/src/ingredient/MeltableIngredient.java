package ingredient;

/**
 * Created by Basile Vu on 29.05.2016.
 */
public abstract class MeltableIngredient extends Ingredient {

    private int meltDegree = 0;
    private int meltThreshold;

    public MeltableIngredient(String name, int meltThreshold) {
        super(name);
        this.meltThreshold = meltThreshold;
    }

    @Override
    public void bake() {
        super.safeBake();
        if (getBakingDegree() >= meltThreshold) {
            meltDegree++;
        }
    }

    public boolean isMelted() {
        return meltDegree > 0;
    }

    public int getMeltDegree() {
        return meltDegree;
    }

    // FIXME
    @Override
    public String toString() {
        if (isMelted()) {
            return super.toString() + "[M]";
        }
        return super.toString();
    }
}
