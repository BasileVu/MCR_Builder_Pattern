package builder;

import exceptions.BaseAlreadyCreatedException;
import exceptions.MissingBaseException;
import ingredient.Dough;
import ingredient.Ingredient;
import ingredient.MeltableIngredient;
import product.Pizza;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public class PizzaBuilder extends FoodBuilder {
    private Dough base;

    public void buildBase() throws BaseAlreadyCreatedException {
        if (base != null) {
            throw new BaseAlreadyCreatedException();
        }

        this.base = new Dough();
    }

    /**
     * Adds an ingredient on the Pizza.
     *
     * @param ingredient The ingredient to add. If no base is there, the ingredient is lost.
     */
    public void addIngredient(Ingredient ingredient) throws MissingBaseException {
        if (base == null) {
            throw new MissingBaseException();
        }
        ingredients.add(ingredient);
    }

    @Override
    public void bake() {
        if (base != null) {
            base.bake();
        }

        boolean meltFound = false;
        for (int i = ingredients.size() - 1; i >= 0; --i) {

            if (!meltFound) {
               ingredients.get(i).bake();
            }

            if (ingredients.get(i) instanceof MeltableIngredient) {
                meltFound = true;
            }
        }
    }

    public Pizza getProgress() {
        return new Pizza(base, ingredients);
    }

    public Pizza getPizza() throws MissingBaseException {
        if (base == null) {
            throw new MissingBaseException();
        }

        return new Pizza(base, ingredients);
    }
}
