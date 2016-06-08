package gui;

import builder.BurgerBuilder;
import exceptions.MissingBaseException;
import ingredient.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sebbos on 07.06.2016.
 */
public class BurgerBuildPanel extends JPanel {

    final BurgerBuilder builder;

    public BurgerBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        builder = new BurgerBuilder();
    }

    public void addBottomBread() {
        builder.buildBase();
        repaint();
    }

    public void addMiddleBread() {
        builder.addIngredient(new BreadMiddle());
        repaint();
    }

    public void addTopBread() {
        builder.buildTop();
        repaint();
    }

    public void addMayo() {
        builder.addIngredient(new Mayo());
        repaint();
    }

    public void addMeat() {
        builder.addIngredient(new Meat());
        repaint();
    }

    public void addTomato() {
        builder.addIngredient(new Tomato());
        repaint();
    }

    public void addSalad() {
        builder.addIngredient(new Salad());
        repaint();
    }

    public void addOnion() {
        builder.addIngredient(new Onion());
        repaint();
    }

    public void addPickle() {
        builder.addIngredient(new Pickle());
        repaint();
    }

    public void addEgg() {
        builder.addIngredient(new Egg());
        repaint();
    }

    public void addCheddar() {
        builder.addIngredient(new Cheese("cheddar1.png", 1));
        repaint();
    }

    public void addGruyere() {
        builder.addIngredient(new Cheese("gruyere.png", 1));
        repaint();
    }

    public void addKetchup() {
        builder.addIngredient(new Ketchup());
        repaint();
    }

    public void bake() {
        builder.bake();
        repaint();
    }

    public void getProduct() {
        // TODO
    }

    // FIXME draw all ingredients with spacing and resizing
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int offset = 0;

        try {
            Ingredient[] ingredients = builder.getProgress().getIngredients();
            for (int i = 0; i < ingredients.length; ++i) {

                // FIXME use a wrapper with spacing instead of this
                if (ingredients[i] instanceof Sauce) {

                } else if (ingredients[i] instanceof Cheese) {
                    offset += 0.03 * getHeight();
                } else if (ingredients[i] instanceof BreadTop) {
                    offset += 0.09 * getHeight();
                } else {
                    offset += 0.06 * getHeight();
                }

                g.drawImage((ingredients[i].getImage().getScaledInstance((int) (0.75 * getWidth()), (int) (0.25 * getHeight()),
                        Image.SCALE_DEFAULT)), (int) (0.125 * getWidth()), (int)(0.6 * getHeight()) - offset, null);
            }
        } catch (MissingBaseException e) {
            System.err.println("Missing base");
        }
    }
}
