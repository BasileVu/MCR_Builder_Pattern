package gui;

import ingredient.Ingredient;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Basile Vu on 09.06.2016.
 */
public class PizzaImageManager {

    public static String IMG_FOLDER = "design/pizza/exports/images/";

    public static String DOUGH = "base.png";

    public static String BASIL = "basil.png";
    public static String MOZZARELLA = "cheese.png";
    public static String MELTED_CHEESE = "melted_cheese.png";
    public static String MUSHROOMS = "mushrooms.png";
    public static String OLIVE = "olives.png";
    public static String ONION = "onion.png";
    public static String TOMATO = "tomato.png";

    // FIXME hashcode for ingredients
    HashMap<Ingredient, BufferedImage> existingIngredients = new HashMap<>();

    public void registerPizzaIngredient(Ingredient i, String imageName) {
        try {
            existingIngredients.put(i, ImageIO.read(new File(IMG_FOLDER + imageName)));
        } catch (IOException e) {
            System.out.println(imageName + " could not be loaded");
        }
    }

    public BufferedImage getBufferedImage(Ingredient i) {
        return existingIngredients.get(i);
    }
}
