package load_image;

import java.awt.*;
import java.applet.*;
import java.awt.image.*;

public class Load_image extends Applet {

    Image picture;  //picture is the object of class type Image
    int width, height;

    public void init() {
        //to load image 'PIC.png' for the build folder of the project
        picture = getImage(getDocumentBase(), "PIC.png"); 
    }

    public void paint(Graphics g) {
        //displaying text "Original Image" in applet window at co-ordinate(30,20).
        g.drawString("Original Image", 30, 20);
        
        //displaying the image in applet window at co-ordinate(30,30).
        g.drawImage(picture, 30, 30, this);
        
        width = picture.getWidth(this);  //to get the width of the image
        height = picture.getHeight(this);  //to get the height of the image
        
        //displaying text "Original Image Size" in applet window at co-ordinate(30,160).
        g.drawString("Original Image Size: " + width + " x " + height, 30, 160);
        
        //displaying text "Scaled Image" in applet window at co-ordinate(30,195).
        g.drawString("Scaled Image", 30, 195);
        
        //dsiplaying the scaled image, twice the size of original image at co-ordinate(30,205).
        g.drawImage(picture, 30, 205, 2 * width, 2 * height, this);
        
        //displaying text "Scaled Image Size" in applet window at co-ordinate(30,450).
        g.drawString("Scaled Image Size: " + width*2 + " x " + height*2, 30, 450);
       
    }
}
