package gui;

import builder.BurgerBuilder;
import exceptions.MissingBaseException;
import exceptions.TopAlreadyPlacedException;
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
        addIngredient(new BreadMiddle());
    }

    public void addTopBread() {
        try {
            builder.buildTop();
        } catch (MissingBaseException e) {
            System.err.println("Missing base");
        }
        repaint();
    }

    public void addMayo() {
        addIngredient(new Mayo());
    }

    public void addMeat() {
        addIngredient(new Meat());
    }

    public void addTomato() {
        addIngredient(new Tomato());
    }

    public void addSalad() {
        addIngredient(new Salad());
    }

    public void addOnion() {
        addIngredient(new Onion());
    }

    public void addPickle() {
        addIngredient(new Pickle());
    }

    public void addEgg() {
        addIngredient(new Egg());
    }

    public void addCheddar() {
        addIngredient(new Cheese("cheddar1.png", 1));
    }

    public void addGruyere() {
        addIngredient(new Cheese("gruyere.png", 1));
    }

    public void addKetchup() {
        addIngredient(new Ketchup());
    }

    public void bake() {
        builder.bake();
        repaint();
    }

    public void getProduct() {
        // TODO
    }

    private void addIngredient(Ingredient i) {
        try {
            builder.addIngredient(i);
        } catch (MissingBaseException e) {
            System.err.println("Missing bottom bread");
        } catch (TopAlreadyPlacedException e) {
            System.err.println("Top bread already placed");
        }
        repaint();
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
