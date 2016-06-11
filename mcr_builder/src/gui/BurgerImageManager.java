package gui;

import ingredient.Ingredient;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Basile Vu on 09.06.2016.
 */
public class BurgerImageManager {

    public static String IMG_FOLDER = "design/burger/exports/images/";

    public static String BREAD_BOTTOM = "bread_bottom.png";
    public static String BREAD_MIDDLE = "bread_middle.png";
    public static String BREAD_TOP = "bread_top_sesame.png";

    public static String TOMATO = "tomato_slices.png";
    public static String MEAT = "meat.png";
    public static String SALAD = "salad.png";
    public static String ONION = "onion1.png";
    public static String PICKLE = "pickle.png";
    public static String EGG = "egg.png";
    public static String CHEDDAR = "cheddar1.png";
    public static String GRUYERE = "gruyere.png";

    public static String MAYO = "mayo.png";
    public static String KETCHUP = "ketchup.png";

    // FIXME hashcode for ingredients
    HashMap<Ingredient, ImageContext> existingIngredients = new HashMap<>();


    public void registerBurgerIngredient(Ingredient i, String imageName, double bottomSpacingRatio) {
        try {
            existingIngredients.put(i, new ImageContext(ImageIO.read(new File(IMG_FOLDER + imageName)), bottomSpacingRatio));
        } catch (IOException e) {
            System.out.println(imageName + " could not be loaded");
        }
    }

    public ImageContext getImageContext(Ingredient i) {
        return existingIngredients.get(i);
    }
}
