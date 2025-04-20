import java.awt.Color;

/**
 * Write a description of class GreenChannelFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025
 */
public class GreenChannelFilter extends Filter
{
    public GreenChannelFilter() {
        super("Green Channel");
    }

    public void apply(OFImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color c = image.getPixel(x, y);
                int green = c.getGreen();
                image.setPixel(x, y, new Color(green, green, green));
            }
        }
    }
}
