
/**
 * Write a description of class WarholFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025
 */
public class WarholFilter extends Filter
{
    public WarholFilter() {
        super("Warhol");
    }

    public void apply(OFImage image) {
        int w = image.getWidth() / 2;
        int h = image.getHeight() / 2;

        OFImage original = new OFImage(image);
        OFImage red = new OFImage(image);
        OFImage green = new OFImage(image);
        OFImage blue = new OFImage(image);

        new RedTintFilter().apply(red);
        new GreenTintFilter().apply(green);
        new BlueTintFilter().apply(blue);

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                image.setPixel(x, y, original.getPixel(x * 2, y * 2));
                image.setPixel(x + w, y, red.getPixel(x * 2, y * 2));
                image.setPixel(x, y + h, green.getPixel(x * 2, y * 2));
                image.setPixel(x + w, y + h, blue.getPixel(x * 2, y * 2));
            }
        }
    }
}