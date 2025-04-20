import java.awt.Color;

/**
 * Write a description of class FlippedWarholFilter here.
 *
 * @author Arif Reyhan
 * @version 4/20/2025
 */
public class FlippedWarholFilter extends Filter
{
    public FlippedWarholFilter() {
        super("Flipped Warhol");
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

        flipHorizontal(red);
        flipVertical(green);
        flipHorizontal(blue);
        flipVertical(blue);

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                image.setPixel(x, y, original.getPixel(x * 2, y * 2));
                image.setPixel(x + w, y, red.getPixel(x * 2, y * 2));
                image.setPixel(x, y + h, green.getPixel(x * 2, y * 2));
                image.setPixel(x + w, y + h, blue.getPixel(x * 2, y * 2));
            }
        }
    }

    private void flipHorizontal(OFImage img) {
        int w = img.getWidth();
        int h = img.getHeight();
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w / 2; x++) {
                Color temp = img.getPixel(x, y);
                img.setPixel(x, y, img.getPixel(w - 1 - x, y));
                img.setPixel(w - 1 - x, y, temp);
            }
        }
    }

    private void flipVertical(OFImage img) {
        int w = img.getWidth();
        int h = img.getHeight();
        for (int y = 0; y < h / 2; y++) {
            for (int x = 0; x < w; x++) {
                Color temp = img.getPixel(x, y);
                img.setPixel(x, y, img.getPixel(x, h - 1 - y));
                img.setPixel(x, h - 1 - y, temp);
            }
        }
    }
}
