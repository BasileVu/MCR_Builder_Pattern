package gui.display;

import ingredient.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;

/**
 * Allows ingredients displaying for a pizza. For all ingredients, use their associated images and scaling (how to scale
 * the image relatively to the base).
 */
public class PizzaDisplay extends FoodDisplay {

    private BufferedImage baseImg;
    private BufferedImage doughImg;
    private BufferedImage onionImg;
    private BufferedImage mozzarellaImg;
    private BufferedImage meltedMozzarellaImg;
    private BufferedImage tomatoSauceImg;
    private BufferedImage olivesImg;
    private BufferedImage mushroomsImg;
    private BufferedImage basilImg;

    public static final String IMG_FOLDER = "design/pizza/exports/images/";

    public PizzaDisplay(JPanel panel) {
        super(panel);
        loadImages();
    }

    protected void loadImages() {
        baseImg = loadImage("base.png");
        doughImg = loadImage("dough.png");
        onionImg = loadImage("onion.png");
        mozzarellaImg = loadImage("mozzarella.png");
        meltedMozzarellaImg = loadImage("melted_mozzarella.png");
        tomatoSauceImg = loadImage("tomato_sauce.png");
        olivesImg = loadImage("olives.png");
        mushroomsImg = loadImage("mushrooms.png");
        basilImg = loadImage("basil.png");
    }

    protected BufferedImage loadImage(String name) {
        try {
            return ImageIO.read(new File(IMG_FOLDER + name));
        } catch (IOException e) {
            System.err.println(name + " could not be loaded");
        }
        return null;
    }

    @Override
    public void visit(Dough dough) {
        drawImage(baseImg, 1);

        if (dough.isBurned()) {
            op.filter(doughImg, doughImg);
        }

        drawImage(doughImg, 0.7);
    }

    @Override
    public void visit(Onion onion) {
        if (onion.isBurned()) {
            op.filter(onionImg, onionImg);
        }

        drawImage(onionImg, 0.8);
    }

    @Override
    public void visit(Mozzarella mozzarella) {
        if (mozzarella.isMelted()) {
            drawImage(meltedMozzarellaImg, 0.8);
        } else {
            drawImage(mozzarellaImg, 0.7);
        }
    }

    @Override
    public void visit(TomatoSauce tomatoSauce) {
        drawImage(tomatoSauceImg, 0.7);
    }

    @Override
    public void visit(Olives olives) {
        if (olives.isBurned()) {
            op.filter(olivesImg, olivesImg);
        }

        drawImage(olivesImg, 0.8);
    }

    @Override
    public void visit(Mushrooms mushrooms) {
        if (mushrooms.isBurned()) {
            op.filter(mushroomsImg, mushroomsImg);
        }

        drawImage(mushroomsImg, 0.8);
    }

    @Override
    public void visit(Basil basil) {
        if (basil.isBurned()) {
            op.filter(basilImg, basilImg);
        }

        drawImage(basilImg, 0.8);
    }

    /**
     * Draws the image with a given scaling ratio.
     *
     * @param image The image to draw.
     * @param scaleRatio The scaling ratio if the image, 1.0 is "standard size" (100%), the size of the dough).
     */
    private void drawImage(BufferedImage image, double scaleRatio) {

        int newWidth = (int)(0.7 * panel.getWidth() * scaleRatio);
        int newHeight = (int)(0.7 * panel.getWidth() * scaleRatio);

        Image rescaled = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
        graphics.drawImage(rescaled,
                (panel.getWidth() / 2) - (newWidth / 2),
                (panel.getHeight() / 2) - (newHeight / 2),
                null
        );
    }
}
