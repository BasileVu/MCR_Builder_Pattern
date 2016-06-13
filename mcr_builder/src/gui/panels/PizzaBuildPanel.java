package gui.panels;

import builder.PizzaBuilder;
import exceptions.MissingBaseException;
import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.RescaleOp;

/**
 * Created by Basile Vu on 07.06.2016.
 */
public class PizzaBuildPanel extends JPanel {

    private final PizzaBuilder builder;
    private RescaleOp op;

    public PizzaBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        builder = new PizzaBuilder();
        op = new RescaleOp(0.9f, 0, null);
    }

    public void buildBase() {
        Dough base = new Dough();
        builder.buildBase(base);
        repaint();
    }

    public void addTomato() {
        addIngredient(new Tomato());
    }

    public void addBasil() {
        addIngredient(new Basil());
    }

    public void addOlives() {
        addIngredient(new Olives());
    }

    public void addMozzarella() {
        addIngredient(new Mozzarella());
    }

    public void addMushrooms() {
        addIngredient(new Mushrooms());
    }

    public void addOnion() {
        addIngredient(new Onion());
    }

    public void bake() {
        builder.bake();

        /*Ingredient[] ingredients = builder.getProgress().getIngredients();

        for (Ingredient ing : ingredients) {
            ImageContext context = manager.getImageContext(ing);

            if (context.getImageName() == PizzaImageManager.MOZZARELLA) {
                manager.registerPizzaIngredient(ing, PizzaImageManager.MELTED_MOZZARELLA);
            }
            else {
                BufferedImage baseImage = (BufferedImage) context.getImage();

                for (int i = 0; i < ing.getBakingDegree(); i++) {
                    op.filter(baseImage, baseImage);
                }

                manager.registerPizzaIngredient(ing, context);
            }
        }*/

        repaint();
    }

    public void getProduct() {
        // TODO
    }

    private void addIngredient(Ingredient i) {
        try {
            builder.addIngredient(i);
        } catch (MissingBaseException e) {
            System.err.println("Missing dough");
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        /*Ingredient[] ingredients = builder.getProgress().getIngredients();

        for (Ingredient ing : ingredients) {
            ImageContext context = manager.getImageContext(ing);
            BufferedImage baseImage = (BufferedImage) context.getImage();

            g.drawImage((baseImage.getScaledInstance((int) (0.75 * getWidth()), (int) (0.7 * getHeight()), Image.SCALE_DEFAULT)),
                    (int) (0.125 * getWidth()), (int)(0.2 * getHeight()), null);
        }*/
    }
}