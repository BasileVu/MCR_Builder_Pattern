package gui.visitor;

import gui.pizzaIngredient.MiddleBread;
import ingredient.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class BurgerDisplay implements FoodDisplay {

    private final JPanel panel;

    private BufferedImage bottomBreadImg;
    private BufferedImage middleBreadImg;
    private BufferedImage topBreadImg;
    private BufferedImage tomatoImg;
    private BufferedImage meatImg;
    private BufferedImage saladImg;
    private BufferedImage onionImg;
    private BufferedImage pickleImg;
    private BufferedImage cheddarImg;
    private BufferedImage gruyereImg;
    private BufferedImage eggImg;
    private BufferedImage ketchupImg;
    private BufferedImage mayoImg;

    public static String IMG_FOLDER = "design/burger/exports/images/";

    private int offset = 0;

    public BurgerDisplay(JPanel panel) {
        this.panel = panel;
        loadImages();
    }

    private void loadImages() {
        bottomBreadImg = loadImage("bread_bottom.png");
        middleBreadImg = loadImage("bread_middle.png");
        topBreadImg = loadImage("bread_top_sesame.png");
        tomatoImg = loadImage("tomato_slices.png");
        meatImg = loadImage("meat.png");
        saladImg = loadImage("salad.png");
        onionImg = loadImage("onion1.png");
        pickleImg = loadImage("pickle.png");
        cheddarImg = loadImage("cheddar1.png");
        gruyereImg = loadImage("gruyere.png");
        eggImg = loadImage("egg.png");
        ketchupImg = loadImage("ketchup.png");
        mayoImg = loadImage("mayo.png");
    }

    private BufferedImage loadImage(String name) {
        try {
            return ImageIO.read(new File(IMG_FOLDER + name));
        } catch (IOException e) {
            System.err.println(name + " could not be loaded");
        }
        return null;
    }

    public void reset() {
        offset = 0;
    }

    @Override
    public void visit(Tomato tomato) {
        drawImage(tomatoImg, 0.02);
    }

    @Override
    public void visit(Meat meat) {
        drawImage(meatImg, );
    }

    @Override
    public void visit(BottomBread bottomBread) {
        drawImage(bottomBread, );
    }

    @Override
    public void visit(MiddleBread middleBread) {

    }

    @Override
    public void visit(TopBread topBread) {

    }

    @Override
    public void visit(Salad salad) {

    }

    @Override
    public void visit(Onion onion) {

    }

    @Override
    public void visit(Pickle pickle) {

    }

    @Override
    public void visit(Cheddar cheddar) {

    }

    @Override
    public void visit(Egg egg) {

    }

    @Override
    public void visit(Gruyere gruyere) {

    }

    @Override
    public void visit(Ketchup ketchup) {

    }

    @Override
    public void visit(Mayo mayo) {

    }

    private void drawImage(BufferedImage image, double bottomSpacingRatio) {
        offset += bottomSpacingRatio * panel.getHeight();
        Image rescaled = image.getScaledInstance((int) (0.75 * panel.getWidth()), (int) (0.3 * panel.getHeight()), Image.SCALE_DEFAULT);

        panel.getGraphics().drawImage(rescaled, (int) (0.125 * panel.getWidth()), (int)(0.6 * panel.getHeight()) - offset, null);
    }
}
