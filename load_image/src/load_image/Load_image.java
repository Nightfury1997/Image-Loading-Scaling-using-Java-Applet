package load_image;

import java.awt.*;
import java.applet.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;

public class Load_image extends Applet {

    Image picture,pic;
    int width, height;

    public void init() {
        picture = getImage(getDocumentBase(), "PIC.png");
    }

    public void paint(Graphics g) {
        g.drawString("Original Image", 30, 20);
        g.drawImage(picture, 30, 30, this);
        width = picture.getWidth(this);
        height = picture.getHeight(this);
        g.drawString("Original Image Size: " + width + " x " + height, 30, 160);
        g.drawString("Scaled Image", 30, 195);
        g.drawImage(picture, 30, 205, 2 * width, 2 * height, this);
        g.drawString("Scaled Image Size: " + width*2 + " x " + height*2, 30, 450);
       
    }
}
