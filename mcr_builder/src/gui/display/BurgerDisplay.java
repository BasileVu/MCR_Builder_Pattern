package gui.display;

import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class BurgerDisplay extends FoodDisplay {

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

    public static final String IMG_FOLDER = "design/burger/exports/images/";

    private int offset = 0;

    public BurgerDisplay(JPanel panel) {
        super(panel);
        loadImages();
    }

    @Override
    protected void loadImages() {
        bottomBreadImg = loadImage(IMG_FOLDER + "bread_bottom.png");
        middleBreadImg = loadImage(IMG_FOLDER + "bread_middle.png");
        topBreadImg = loadImage(IMG_FOLDER + "bread_top_sesame.png");
        tomatoImg = loadImage(IMG_FOLDER + "tomato_slices.png");
        meatImg = loadImage(IMG_FOLDER + "meat.png");
        saladImg = loadImage(IMG_FOLDER + "salad.png");
        onionImg = loadImage(IMG_FOLDER + "onion1.png");
        pickleImg = loadImage(IMG_FOLDER + "pickle.png");
        cheddarImg = loadImage(IMG_FOLDER + "cheddar1.png");
        gruyereImg = loadImage(IMG_FOLDER + "gruyere.png");
        eggImg = loadImage(IMG_FOLDER + "egg.png");
        ketchupImg = loadImage(IMG_FOLDER + "ketchup.png");
        mayoImg = loadImage(IMG_FOLDER+ "mayo.png");
    }

    /**
     * Resets the offset. Must be called EVERYTIME before drawing a burger (otherwise the ingredients will not be drawn
     * where there should be (drawn too high).
     */
    public void reset() {
        offset = 0;
    }

    @Override
    public void visit(Tomato tomato) {
        drawImage(tomatoImg, 0.02);
    }

    @Override
    public void visit(Meat meat) {
        drawImage(meatImg, 0.06);
    }

    @Override
    public void visit(BottomBread bottomBread) {
        drawImage(bottomBreadImg, 0);
    }

    @Override
    public void visit(MiddleBread middleBread) {
        drawImage(middleBreadImg, 0.05);
    }

    @Override
    public void visit(TopBread topBread) {
        drawImage(topBreadImg, 0.05);
    }

    @Override
    public void visit(Salad salad) {
        drawImage(saladImg, 0.04);
    }

    @Override
    public void visit(Onion onion) {
        drawImage(onionImg, 0.02);
    }

    @Override
    public void visit(Pickle pickle) {
        drawImage(pickleImg, 0.02);
    }

    @Override
    public void visit(Cheddar cheddar) {
        drawImage(cheddarImg, 0.02);
    }

    @Override
    public void visit(Egg egg) {
        drawImage(eggImg, 0.02);
    }

    @Override
    public void visit(Gruyere gruyere) {
        drawImage(gruyereImg, 0.02);
    }

    @Override
    public void visit(Ketchup ketchup) {
        drawImage(ketchupImg, 0);
    }

    @Override
    public void visit(Mayo mayo) {
        drawImage(mayoImg, 0);
    }

    /**
     * Draw the image, with a given spacing under it (relatively to the offset).
     *
     * @param image The image to draw.
     * @param bottomSpacingRatio The spacing under it, in height percentage (of the panel). 0.06 -> 6% of height
     */
    private void drawImage(BufferedImage image, double bottomSpacingRatio) {
        offset += bottomSpacingRatio * panel.getHeight();
        Image rescaled = image.getScaledInstance((int) (0.8 * panel.getWidth()), (int) (0.3 * panel.getHeight()), Image.SCALE_DEFAULT);

        graphics.drawImage(rescaled, (int) (0.1 * panel.getWidth()), (int)(0.6 * panel.getHeight()) - offset, null);
    }
}
