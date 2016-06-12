package gui;

import builder.PizzaBuilder;
import exceptions.MissingBaseException;
import ingredient.BurnableIngredient;
import ingredient.Ingredient;
import ingredient.MeltableIngredient;
import javafx.scene.image.*;
import sun.awt.image.BufferedImageGraphicsConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

/**
 * Created by Basile Vu on 07.06.2016.
 */
public class PizzaBuildPanel extends JPanel {

    private final PizzaBuilder builder;
    private PizzaImageManager manager;
    private RescaleOp op;

    public PizzaBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        builder = new PizzaBuilder();
        manager = new PizzaImageManager();
        op = new RescaleOp(0.9f, 0, null);
    }

    public void buildBase() {
        BurnableIngredient base = new BurnableIngredient(3);
        builder.buildBase(base);
        manager.registerPizzaIngredient(base, PizzaImageManager.DOUGH);
        repaint();
    }

    public void addTomato() {
        addIngredient(new BurnableIngredient(3), PizzaImageManager.TOMATO);
    }

    public void addBasil() {
        addIngredient(new BurnableIngredient(3), PizzaImageManager.BASIL);
    }

    public void addOlives() {
        addIngredient(new BurnableIngredient(3), PizzaImageManager.OLIVE);
    }

    public void addMozzarella() {
        addIngredient(new MeltableIngredient(1), PizzaImageManager.MOZZARELLA);
    }

    public void addMushrooms() {
        addIngredient(new BurnableIngredient(3), PizzaImageManager.MUSHROOMS);
    }

    public void addOnion() {
        addIngredient(new BurnableIngredient(3), PizzaImageManager.ONION);
    }

    public void bake() {
        builder.bake();

        Ingredient[] ingredients = builder.getProgress().getIngredients();

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
        }

        repaint();
    }

    public void getProduct() {
        // TODO
    }

    private void addIngredient(Ingredient i, String imageName) {
        try {
            builder.addIngredient(i);
            manager.registerPizzaIngredient(i, imageName);
        } catch (MissingBaseException e) {
            System.err.println("Missing dough");
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Ingredient[] ingredients = builder.getProgress().getIngredients();

        for (Ingredient ing : ingredients) {
            ImageContext context = manager.getImageContext(ing);
            BufferedImage baseImage = (BufferedImage) context.getImage();

            g.drawImage((baseImage.getScaledInstance((int) (0.75 * getWidth()), (int) (0.7 * getHeight()), Image.SCALE_DEFAULT)),
                    (int) (0.125 * getWidth()), (int)(0.2 * getHeight()), null);
        }
    }
}
