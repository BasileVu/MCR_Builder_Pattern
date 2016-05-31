package ingredient;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public abstract class Ingredient {
    private final String name;
    private int bakingDegree = 0;

    Ingredient(String name) {
        this.name = name;
    }

    public void bake() {
        bakingDegree++;
    }

    public int getBakingDegree() {
        return bakingDegree;
    }

    @Override
    public String toString() {
        return name;
    }
}
