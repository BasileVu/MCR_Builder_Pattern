package gui.visitor;

import gui.pizzaIngredient.MiddleBread;
import ingredient.*;

import java.awt.*;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class BurgerDisplay implements FoodDisplay {

    private final Graphics graphics;

    public BurgerDisplay(Graphics g) {
        this.graphics = g;
    }

    @Override
    public void visit(Tomato t) {
        // TODO
    }

    @Override
    public void visit(Meat m) {
        // TODO
    }

    @Override
    public void visit(BottomBread t) {

    }

    @Override
    public void visit(Dough t) {

    }

    @Override
    public void visit(MiddleBread t) {

    }

    @Override
    public void visit(TopBread t) {

    }

    @Override
    public void visit(Salad salad) {

    }

    @Override
    public void visit(Onion onion) {

    }

    @Override
    public void visit(Pickle pickle) {

    }

    @Override
    public void visit(Cheddar cheddar) {

    }

    @Override
    public void visit(Egg egg) {

    }

    @Override
    public void visit(Gruyere gruyere) {

    }

    @Override
    public void visit(Ketchup t) {

    }

    @Override
    public void visit(Mayo t) {

    }
}
