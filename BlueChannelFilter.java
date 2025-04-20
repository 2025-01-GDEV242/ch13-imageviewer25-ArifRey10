import java.awt.Color;

/**
 * Write a description of class BlueChannelFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025

 */
public class BlueChannelFilter extends Filter
{
    public BlueChannelFilter() {
        super("Blue Channel");
    }

    public void apply(OFImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color c = image.getPixel(x, y);
                int blue = c.getBlue();
                image.setPixel(x, y, new Color(blue, blue, blue));
            }
        }
    }
}

