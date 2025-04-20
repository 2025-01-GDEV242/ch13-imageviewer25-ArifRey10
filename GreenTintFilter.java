import java.awt.Color;

/**
 * Write a description of class GreenTintFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025
 */
public class GreenTintFilter extends Filter
{
    public GreenTintFilter() {
        super("Green Tint");
    }

    public void apply(OFImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int green = image.getPixel(x, y).getGreen();
                image.setPixel(x, y, new Color(0, green, 0));
            }
        }
    }
}
