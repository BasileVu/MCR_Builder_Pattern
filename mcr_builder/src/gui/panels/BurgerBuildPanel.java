package gui.panels;

import builder.BurgerBuilder;
import exceptions.MissingBaseException;
import exceptions.TopAlreadyPlacedException;
import gui.BurgerImageManager;
import ingredient.BurnableIngredient;
import ingredient.Ingredient;
import ingredient.MeltableIngredient;

import javax.swing.*;
import java.awt.*;
import java.awt.image.RescaleOp;

/**
 * Created by sebbos on 07.06.2016.
 */
public class BurgerBuildPanel extends JPanel {

    private final BurgerBuilder builder;
    private BurgerImageManager manager;
    private RescaleOp op;

    public BurgerBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        builder = new BurgerBuilder();
        manager = new BurgerImageManager();
        op = new RescaleOp(0.9f, 0, null);
    }

    public void addBottomBread() {
        BurnableIngredient base = new BurnableIngredient(3);
        builder.buildBase(base);
        //manager.registerBurgerIngredient(base, BurgerImageManager.BREAD_BOTTOM, 0);
        repaint();
    }

    public void addMiddleBread() {
        addIngredient(new BurnableIngredient(3), BurgerImageManager.BREAD_MIDDLE, 0.05);
    }

    public void addTopBread() {
        try {
            BurnableIngredient top = new BurnableIngredient(3);
            builder.buildTop(top);
            //manager.registerBurgerIngredient(top, BurgerImageManager.BREAD_TOP, 0.05);
        } catch (MissingBaseException e) {
            System.err.println("Missing base");
        }
        repaint();
    }

    public void addMeat() {
        addIngredient(new BurnableIngredient(1), BurgerImageManager.MEAT, 0.06);
    }

    public void addTomato() {
        addIngredient(new BurnableIngredient(1), BurgerImageManager.TOMATO, 0.04);
    }

    public void addSalad() {
        addIngredient(new BurnableIngredient(1), BurgerImageManager.SALAD, 0.04);
    }

    public void addOnion() {
        addIngredient(new BurnableIngredient(1), BurgerImageManager.ONION, 0.02);
    }

    public void addPickle() {
        addIngredient(new BurnableIngredient(1), BurgerImageManager.PICKLE, 0.02);
    }

    public void addEgg() {
        addIngredient(new BurnableIngredient(1), BurgerImageManager.EGG, 0.02);
    }

    public void addCheddar() {
        addIngredient(new MeltableIngredient(1), BurgerImageManager.CHEDDAR, 0.02);
    }

    public void addGruyere() {
        addIngredient(new MeltableIngredient(1), BurgerImageManager.GRUYERE, 0.02);
    }

    public void addKetchup() {
        addIngredient(new Ingredient(), BurgerImageManager.KETCHUP, 0);
    }

    public void addMayo() {
        addIngredient(new Ingredient(), BurgerImageManager.MAYO, 0);
    }

    public void bake() {
        builder.bake();

        /*BurgerIngredient[] ingredients = builder.getProgress().getIngredients();

        for (BurgerIngredient ing : ingredients) {

            if (context.getImageName() == BurgerImageManager.CHEDDAR) {
                // todo : à remplacer par une image de cheddar fondue
                manager.registerBurgerIngredient(ing, BurgerImageManager.KETCHUP, context.getBottomSpacingRatio());
            }
            else if (context.getImageName() == BurgerImageManager.GRUYERE) {
                // todo : à remplacer par une image de gruyère fondu
                manager.registerBurgerIngredient(ing, BurgerImageManager.MAYO, context.getBottomSpacingRatio());
            }
            else {
                BufferedImage baseImage = (BufferedImage) context.getImage();

                // on noirçit l'image selon le degré de cuisson
                for (int i = 0; i < ing.getBakingDegree(); i++) {
                    op.filter(baseImage, baseImage);
                }

                manager.registerBurgerIngredient(ing, context);
            }
        }*/

        repaint();
    }

    public void getProduct() {
        // TODO
    }

    private void addIngredient(Ingredient i, String imageName, double bottomSpacingRatio) {
        try {
            builder.addIngredient(i);
            //manager.registerBurgerIngredient(i, imageName, bottomSpacingRatio);
        } catch (MissingBaseException e) {
            System.err.println("Missing bottom bread");
        } catch (TopAlreadyPlacedException e) {
            System.err.println("Top bread already placed");
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int offset = 0;
        Ingredient[] ingredients = builder.getProgress().getIngredients();

        // fixme : je crois qu'on dessine plusieurs fois les même images
        /*for (Ingredient ing : ingredients) {
            ImageContext context = manager.getImageContext(ing);
            BufferedImage baseImage = (BufferedImage) context.getImage();
            offset += context.getBottomSpacingRatio() * getHeight();

            g.drawImage((baseImage.getScaledInstance((int) (0.75 * getWidth()), (int) (0.3 * getHeight()), Image.SCALE_DEFAULT)),
                    (int) (0.125 * getWidth()), (int)(0.6 * getHeight()) - offset, null);
        }*/
    }
}
