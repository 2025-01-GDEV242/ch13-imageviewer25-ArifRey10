import java.awt.Color;

/**
 * Write a description of class BlueTintFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025
 */
public class BlueTintFilter extends Filter
{
    public BlueTintFilter() {
        super("Blue Tint");
    }

    public void apply(OFImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int blue = image.getPixel(x, y).getBlue();
                image.setPixel(x, y, new Color(0, 0, blue));
            }
        }
    }
}
