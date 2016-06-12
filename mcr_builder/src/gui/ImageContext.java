package gui;

import java.awt.Image;

/**
 * Created by Basile Vu on 09.06.2016.
 */
public class ImageContext {
    private final Image image;
    private final String imageName;
    private final double bottomSpacingRatio;

    public ImageContext(Image image, String imageName, double bottomSpacingRatio) {
        this.image = image;
        this.imageName = imageName;
        this.bottomSpacingRatio = bottomSpacingRatio;
    }

    public Image getImage() {
        return image;
    }

    public String getImageName() {
        return imageName;
    }

    public double getBottomSpacingRatio() {
        return bottomSpacingRatio;
    }
}
