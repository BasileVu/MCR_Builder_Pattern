package gui.pizzaIngredient;

import ingredient.Ingredient;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public abstract class BurgerIngredient {
    private BufferedImage image;
    private final Ingredient ingredient;
    private double bottomSpacing;

    public static final String IMG_FOLDER = "design/burger/exports/images/";

    public BurgerIngredient(Ingredient ingredient, String imageName, double bottomSpacing) {
        this.ingredient = ingredient;
        this.bottomSpacing = bottomSpacing;
        try {
            image = ImageIO.read(new File(IMG_FOLDER + imageName));
        } catch (IOException e) {
            System.out.println(imageName + " could not be loaded");
        }
    }

    BufferedImage getImage() {
        return image;
    }

    double getBottomSpacing() {
        return bottomSpacing;
    }
}
