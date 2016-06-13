package gui.visitor;

import ingredient.*;

import javax.swing.*;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class PizzaDisplay implements FoodDisplay {

    private final JPanel panel;

    public PizzaDisplay(JPanel panel) {
        this.panel = panel;
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
    public void visit(TomatoSauce tomatoSauce) {

    }

    @Override
    public void visit(Olives olives) {

    }

    @Override
    public void visit(Mushrooms mushrooms) {

    }

    @Override
    public void visit(Basil basil) {

    }
}
