package gui.visitor;

import ingredient.BottomBread;
import ingredient.Meat;
import ingredient.Tomato;

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

    }

    @Override
    public void visit(BottomBread t) {

    }
}
