import java.awt.Color;

/**
 * Write a description of class RedChannelFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025
 */
public class RedChannelFilter extends Filter
{
    public RedChannelFilter() {
        super("Red Channel");
    }
     public void apply(OFImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color c = image.getPixel(x, y);
                int red = c.getRed();
                image.setPixel(x, y, new Color(red, red, red));
            }
        }
    }
}
