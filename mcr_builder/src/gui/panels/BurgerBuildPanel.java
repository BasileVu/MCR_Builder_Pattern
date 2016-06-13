package gui.panels;

import builder.BurgerBuilder;
import exceptions.MissingBaseException;
import exceptions.TopAlreadyPlacedException;
import gui.visitor.BurgerDisplay;
import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.RescaleOp;

/**
 * Created by sebbos on 07.06.2016.
 */
public class BurgerBuildPanel extends JPanel {

    private final BurgerBuilder builder;
    private final BurgerDisplay display;
    private RescaleOp op;

    public BurgerBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        builder = new BurgerBuilder();
        display = new BurgerDisplay(this);
        op = new RescaleOp(0.9f, 0, null);
    }

    public void addBottomBread() {
        builder.buildBase();
        //manager.registerBurgerIngredient(base, BurgerImageManager.BREAD_BOTTOM, 0);
        repaint();
    }

    public void addMiddleBread() {
        addIngredient(new MiddleBread());
    }

    public void addTopBread() {
        try {
            builder.buildTop();
        } catch (MissingBaseException e) {
            System.err.println("Missing base");
        }
        repaint();
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
        addIngredient(new Cheddar());
    }

    public void addGruyere() {
        addIngredient(new Gruyere());
    }

    public void addKetchup() {
        addIngredient(new Ketchup());
    }

    public void addMayo() {
        addIngredient(new Mayo());
    }

    public void bake() {
        builder.bake();

        /*Ingredient[] ingredients = builder.getProgress().getIngredients();

        for (Ingredient ing : ingredients) {

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

    private void addIngredient(Ingredient i) {
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

        for (Ingredient i : ingredients) {
            i.accept(display);
        }
    }
}
