package gui.display;

import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Allows ingredients displaying for a burger. For all ingredients, use their associated images and bottom-spacing (the
 * space in percentage of height to draw under it).
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
    private BufferedImage meltedCheddarImg;
    private BufferedImage gruyereImg;
    private BufferedImage meltedGruyereImg;
    private BufferedImage eggImg;
    private BufferedImage ketchupImg;
    private BufferedImage mayoImg;

    public static final String IMG_FOLDER = "design/burger/exports/images/";

    private int offset = 0;

    public BurgerDisplay(JPanel panel) {
        super(panel);
        loadImages();
    }

    /**
     * Resets the offset. Must be called EVERYTIME before drawing a burger (otherwise the ingredients will not be drawn
     * where there should be (drawn too high).
     */
    @Override
    protected void loadImages() {
        bottomBreadImg = loadImage(IMG_FOLDER + "bread_bottom.png");
        middleBreadImg = loadImage(IMG_FOLDER + "bread_middle.png");
        topBreadImg = loadImage(IMG_FOLDER + "bread_top_sesame.png");
        tomatoImg = loadImage(IMG_FOLDER + "tomato_slice.png");
        meatImg = loadImage(IMG_FOLDER + "meat.png");
        saladImg = loadImage(IMG_FOLDER + "salad.png");
        onionImg = loadImage(IMG_FOLDER + "onion1.png");
        pickleImg = loadImage(IMG_FOLDER + "pickle.png");
        cheddarImg = loadImage(IMG_FOLDER + "cheddar1.png");
        meltedCheddarImg = loadImage(IMG_FOLDER + "melted_cheddar1.png");
        gruyereImg = loadImage(IMG_FOLDER + "gruyere.png");
        meltedGruyereImg = loadImage(IMG_FOLDER + "melted_gruyere.png");
        eggImg = loadImage(IMG_FOLDER + "egg.png");
        ketchupImg = loadImage(IMG_FOLDER + "ketchup.png");
        mayoImg = loadImage(IMG_FOLDER+ "mayo.png");
    }

    public void reset() {
        offset = 0;
    }

    @Override
    public void visit(Tomato tomato) {
        if (tomato.isBurned()) {
            tempImg = op.filter(tomatoImg, null);

            drawImage(tempImg, 0.02);
        } else {
            drawImage(tomatoImg, 0.02);
        }
    }

    @Override
    public void visit(Meat meat) {
        if (meat.isBurned()) {
            tempImg = op.filter(meatImg, null);

            drawImage(tempImg, 0.06);
        } else {
            drawImage(meatImg, 0.06);
        }
    }

    @Override
    public void visit(BottomBread bottomBread) {
        if (bottomBread.isBurned()) {
            tempImg = op.filter(bottomBreadImg, null);

            drawImage(tempImg, 0);
        } else {
            drawImage(bottomBreadImg, 0);
        }
    }

    @Override
    public void visit(MiddleBread middleBread) {
        if (middleBread.isBurned()) {
            tempImg = op.filter(middleBreadImg, null);

            drawImage(tempImg, 0.05);
        } else {
            drawImage(middleBreadImg, 0.05);
        }
    }

    @Override
    public void visit(TopBread topBread) {
        if (topBread.isBurned()) {
            tempImg = op.filter(topBreadImg, null);

            drawImage(tempImg, 0.05);
        } else {
            drawImage(topBreadImg, 0.05);
        }
    }

    @Override
    public void visit(Salad salad) {
        if (salad.isBurned()) {
            tempImg = op.filter(saladImg, null);

            drawImage(tempImg, 0.04);
        } else {
            drawImage(saladImg, 0.04);
        }
    }

    @Override
    public void visit(Onion onion) {
        if (onion.isBurned()) {
            tempImg = op.filter(onionImg, null);

            drawImage(tempImg, 0.02);
        } else {
            drawImage(onionImg, 0.02);
        }
    }

    @Override
    public void visit(Pickle pickle) {
        if (pickle.isBurned()) {
            tempImg = op.filter(pickleImg, null);

            drawImage(tempImg, 0.02);
        } else {
            drawImage(pickleImg, 0.02);
        }
    }

    @Override
    public void visit(Cheddar cheddar) {
        if (cheddar.isMelted()) {
            drawImage(meltedCheddarImg, 0.02);
        } else {
            drawImage(cheddarImg, 0.02);
        }
    }

    @Override
    public void visit(Egg egg) {
        if (egg.isBurned()) {
            tempImg = op.filter(eggImg, null);

            drawImage(tempImg, 0.02);
        } else {
            drawImage(eggImg, 0.02);
        }
    }

    @Override
    public void visit(Gruyere gruyere) {
        if (gruyere.isMelted()) {
            drawImage(meltedGruyereImg, 0.02);
        } else {
            drawImage(gruyereImg, 0.02);
        }
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
     * Draws the image, relatively to the offset (last drawn position) with a given spacing under it (relatively to the
     * height).
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
