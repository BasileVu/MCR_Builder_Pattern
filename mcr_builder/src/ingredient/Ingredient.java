package ingredient;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class Ingredient {
    private final String name;

    Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
