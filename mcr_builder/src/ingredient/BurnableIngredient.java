package ingredient;

/**
 * Created by Basile Vu on 29.05.2016.
 */
public abstract class BurnableIngredient extends Ingredient {
    private int burnDegree = 0;
    private int burnThreshold;

    public BurnableIngredient(int burnThreshold) {
        this.burnThreshold = burnThreshold;
    }

    @Override
    public void bake() {
        super.safeBake();
        if (getBakingDegree() >= burnThreshold) {
            burnDegree++;
        }
    }

    public boolean isBurned() {
        return burnDegree > 0;
    }

    public int getBurnDegree() {
        return burnDegree;
    }

    // FIXME
    public String toString() {
        if (isBurned()) {
            return super.toString() + "[B]";
        }
        return super.toString();
    }
}
