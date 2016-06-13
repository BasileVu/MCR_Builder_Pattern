package gui.panels;

import builder.PizzaBuilder;
import exceptions.MissingBaseException;
import gui.visitor.PizzaDisplay;
import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.RescaleOp;

/**
 * Created by Basile Vu on 07.06.2016.
 */
public class PizzaBuildPanel extends JPanel {

    private final PizzaBuilder builder = new PizzaBuilder();
    private final PizzaDisplay display;
    private RescaleOp op;

    public PizzaBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        display = new PizzaDisplay(this);
        op = new RescaleOp(0.9f, 0, null);
    }

    public void buildBase() {
        builder.buildBase();
        repaint();
    }

    public void addTomato() {
        addIngredient(new TomatoSauce());
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

        display.setGraphics(g);

        for (Ingredient i : builder.getProgress().getIngredients()) {
            i.accept(display);
        }
    }
}
