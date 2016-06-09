package gui;

import builder.BurgerBuilder;
import exceptions.MissingBaseException;
import exceptions.TopAlreadyPlacedException;
import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

/**
 * Created by sebbos on 07.06.2016.
 */
public class BurgerBuildPanel extends JPanel {

    final BurgerBuilder builder;
    ImageManager manager = new ImageManager();

    public BurgerBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        builder = new BurgerBuilder();
    }

    public void addBottomBread() {
        BurnableIngredient base = new BurnableIngredient(3);
        builder.buildBase(base);
        manager.registerIngredient(base, ImageManager.BREAD_BOTTOM, 0);
        repaint();
    }

    public void addMiddleBread() {
        addIngredient(new BurnableIngredient(3),ImageManager.BREAD_MIDDLE, 0.05);
    }

    public void addTopBread() {
        try {
            BurnableIngredient top = new BurnableIngredient(3);
            builder.buildTop(top);
            manager.registerIngredient(top, ImageManager.BREAD_TOP, 0.05);
        } catch (MissingBaseException e) {
            System.err.println("Missing base");
        }
        repaint();
    }

    public void addMayo() {
        addIngredient(new Ingredient(), ImageManager.MAYO, 0);
    }

    public void addMeat() {
        addIngredient(new BurnableIngredient(1), ImageManager.MEAT, 0.06);
    }

    public void addTomato() {
        addIngredient(new BurnableIngredient(1), ImageManager.TOMATO, 0.04);
    }

    public void addSalad() {
        addIngredient(new BurnableIngredient(1), ImageManager.SALAD, 0.04);
    }

    public void addOnion() {
        addIngredient(new BurnableIngredient(1), ImageManager.ONION, 0.02);
    }

    public void addPickle() {
        addIngredient(new BurnableIngredient(1), ImageManager.PICKLE, 0.02);
    }

    public void addEgg() {
        addIngredient(new BurnableIngredient(1), ImageManager.EGG, 0.02);
    }

    public void addCheddar() {
        addIngredient(new MeltableIngredient(1), ImageManager.CHEDDAR, 0.02);
    }

    public void addGruyere() {
        addIngredient(new MeltableIngredient(1), ImageManager.GRUYERE, 0.02);
    }

    public void addKetchup() {
        addIngredient(new Ingredient(), ImageManager.KETCHUP, 0);
    }

    public void bake() {
        builder.bake();
        repaint();
    }

    public void getProduct() {
        // TODO
    }

    private void addIngredient(Ingredient i, String imageName) {
        addIngredient(i, imageName, ImageManager.DEFAULT_RATIO);
    }

    private void addIngredient(Ingredient i, String imageName, double bottomSpacingRatio) {
        try {
            builder.addIngredient(i);
            manager.registerIngredient(i, imageName, bottomSpacingRatio);
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

        Ingredient[] ingredients = builder.getProgress().getIngredients();
        for (Ingredient ingr: ingredients) {

            ImageContext context = manager.getImageContext(ingr);
            BufferedImage darkerImage = (BufferedImage) context.getImage();
            offset += context.getBottomSpacingRatio() * getHeight();

            RescaleOp op = new RescaleOp(0.9f, 0, null);
            op.filter(darkerImage, darkerImage);

            g.drawImage(
                    (darkerImage.getScaledInstance((int) (0.75 * getWidth()), (int) (0.25 * getHeight()), Image.SCALE_DEFAULT)),
                    (int) (0.125 * getWidth()), (int)(0.6 * getHeight()) - offset, null);
        }
    }
}
