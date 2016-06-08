package ingredient;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Basile Vu on 24.05.2016.
 */
public abstract class Ingredient {

    public static String IMG_FOLDER = "design/burger/exports/images/";

    private BufferedImage image;
    private int bakingDegree = 0;

    Ingredient(String imageName) {
        try {
            image = ImageIO.read(new File(IMG_FOLDER + imageName));
        } catch (IOException e) {
            System.err.println("Could not load " +  IMG_FOLDER + imageName);
        }
    }

    public abstract void bake();

    public void safeBake() {
        bakingDegree++;
    }

    public int getBakingDegree() {
        return bakingDegree;
    }

    public Image getImage() {
        return image;
    }
}
