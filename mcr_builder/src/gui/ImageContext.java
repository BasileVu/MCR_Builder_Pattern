package gui;

import java.awt.Image;

/**
 * Created by Basile Vu on 09.06.2016.
 */
public class ImageContext {
    private final Image image;
    private final double bottomSpacingRatio;

    public ImageContext(Image image, double bottomSpacingRatio) {
        this.image = image;
        this.bottomSpacingRatio = bottomSpacingRatio;
    }

    public Image getImage() {
        return image;
    }

    public double getBottomSpacingRatio() {
        return bottomSpacingRatio;
    }
}
