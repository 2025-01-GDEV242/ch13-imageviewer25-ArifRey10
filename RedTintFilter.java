import java.awt.Color;

/**
 * A filter that applies a red tint to the image.
 * 
 * Author: Arif Reyhan
 * Version: 4/20/2025
 */
public class RedTintFilter extends Filter
{
    public RedTintFilter() {
        super("Red Tint");
    }

    public void apply(OFImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int red = image.getPixel(x, y).getRed();
                image.setPixel(x, y, new Color(red, 0, 0));
            }
        }
    }
}