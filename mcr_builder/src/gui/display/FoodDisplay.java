package gui.display;

import ingredient.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public abstract class FoodDisplay {

    protected final JPanel panel;
    protected Graphics graphics;

    public FoodDisplay(JPanel panel) {
        this.panel = panel;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }


    public void visit(Dough dough) {
        throw new NotImplementedException();
    }

    public void visit(BottomBread bottomBread) {
        throw new NotImplementedException();
    }

    public void visit(MiddleBread middleBread) {
        throw new NotImplementedException();
    }

    public void visit(TopBread topBread) {
        throw new NotImplementedException();
    }

    public void visit(Meat meat) {
        throw new NotImplementedException();
    }

    public void visit(Salad salad) {
        throw new NotImplementedException();
    }

    public void visit(Onion onion){
        throw new NotImplementedException();
    }

    public void visit(Pickle pickle) {
        throw new NotImplementedException();
    }

    public void visit(Cheddar cheddar) {
        throw new NotImplementedException();
    }

    public void visit(Egg egg) {
        throw new NotImplementedException();
    }

    public void visit(Gruyere gruyere) {
        throw new NotImplementedException();
    }

    public void visit(Tomato tomato) {
        throw new NotImplementedException();
    }

    public void visit(Ketchup ketchup) {
        throw new NotImplementedException();
    }

    public void visit(Mayo mayo) {
        throw new NotImplementedException();
    }

    public void visit(Mozzarella mozzarella) {
        throw new NotImplementedException();
    }

    public void visit(Basil basil) {
        throw new NotImplementedException();
    }

    public void visit(TomatoSauce tomatoSauce) {
        throw new NotImplementedException();
    }

    public void visit(Olives olives) {
        throw new NotImplementedException();
    }

    public void visit(Mushrooms mushrooms) {
        throw new NotImplementedException();
    }
}
