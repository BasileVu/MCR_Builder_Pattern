package gui.visitor;

import gui.pizzaIngredient.MiddleBread;
import ingredient.*;

import java.awt.*;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class PizzaDisplay implements FoodDisplay {

    private final Graphics graphics;

    public PizzaDisplay(Graphics g) {
        this.graphics = g;
    }

    @Override
    public void visit(Dough dough) {

    }

    @Override
    public void visit(Onion onion) {

    }

    @Override
    public void visit(Mozzarella mozzarella) {

    }

    @Override
    public void visit(Mushrooms mushrooms) {

    }

    @Override
    public void visit(Basil basil) {

    }
}
