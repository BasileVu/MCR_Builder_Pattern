package gui.display;

import ingredient.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public class PizzaDisplay extends FoodDisplay {
    private RescaleOp op;

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
        op = new RescaleOp(0.6f, 0, null);
        loadImages();
    }

    @Override
    protected void loadImages() {
        doughImg = loadImage(IMG_FOLDER + "dough.png");
        onionImg = loadImage(IMG_FOLDER + "onion.png");
        mozzarellaImg = loadImage(IMG_FOLDER + "mozzarella.png");
        meltedMozzarellaImg = loadImage(IMG_FOLDER + "melted_mozzarella.png");
        tomatoSauceImg = loadImage(IMG_FOLDER + "tomato_sauce.png");
        olivesImg = loadImage(IMG_FOLDER + "olives.png");
        mushroomsImg = loadImage(IMG_FOLDER + "mushrooms.png");
        basilImg = loadImage(IMG_FOLDER + "basil.png");
    }

    @Override
    public void visit(Dough dough) {
        if (dough.isBurned()) {
            op.filter(doughImg, doughImg);
        }

        drawImage(doughImg, 1);
    }

    @Override
    public void visit(Onion onion) {
        drawImage(onionImg, 0.8);
    }

    @Override
    public void visit(Mozzarella mozzarella) {
        if (mozzarella.isMelted()) {
            drawImage(meltedMozzarellaImg, 0.8);
        } else {
            drawImage(mozzarellaImg, 0.8);
        }
    }

    @Override
    public void visit(TomatoSauce tomatoSauce) {
        drawImage(tomatoSauceImg, 0.8);
    }

    @Override
    public void visit(Olives olives) {
        drawImage(olivesImg, 0.8);
    }

    @Override
    public void visit(Mushrooms mushrooms) {
        drawImage(mushroomsImg, 0.8);
    }

    @Override
    public void visit(Basil basil) {
        drawImage(basilImg, 0.8);
    }

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
