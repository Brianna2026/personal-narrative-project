import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here
    public void adjustContrast(int multiplier) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, and traverse the 2D array of Pixel objects.
     * Multiply the red, green, and blue values of each Pixel by the multiplier,
     * and set the color values to the result.
     * -----------------------------------------------------------------------------
     */
    // Creates 2D array 
    Pixel[][] pixels = getPixelsFromImage();
    for(int row = 0; row < pixels.length; row++){
      for(int col = 0; col < pixels[row].length; col++){
        Pixel currentPixel = pixels[row][col];

        // Variables for holding new pixel settings
        int newRed = currentPixel.getRed() * multiplier;
        int newGreen = currentPixel.getGreen() * multiplier;
        int newBlue = currentPixel.getBlue() * multiplier;
        
        if (newRed >  255){
          // set to 255
          newRed = 255;
        }
        
        if (newBlue > 255){
          // set to 255
          newBlue = 255;
        }
        
        if (newGreen > 255){
          // set to 255
          newGreen = 255;
        }

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
    
  }
  
  }
}
  public void makeNegative() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, then traverse the 2D array of pixels. Set
     * the red, green, and blue color values of each Pixel object to the result of
     * 255 minus the current values.
     * -----------------------------------------------------------------------------
     */

    Pixel[][] pixels = getPixelsFromImage();
    
    for (int row = 0; row < pixels.length; row++) {
        for (int col = 0; col < pixels[row].length; col++) {
            Pixel currentPixel = pixels[row][col];

            // Get current RGB values
            int red = currentPixel.getRed();
            int green = currentPixel.getGreen();
            int blue = currentPixel.getBlue();

            // Set new negative values
            currentPixel.setRed(255 - red);
            currentPixel.setGreen(255 - green);
            currentPixel.setBlue(255 - blue);
        }
    }
}
  public void threshold(int value) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, and traverse the 2D array of Pixel objects.
     * Calculate the average of the red, green, and blue value of each Pixel. If the
     * average is less than the parameter value, set the color of the Pixel to BLACK.
     * Otherwise, set the color of the Pixel to WHITE.
     * -----------------------------------------------------------------------------
     */

    Pixel[][] pixels = getPixelsFromImage();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel pixel = pixels[row][col];

        // Calculate average color intensity
        int avg = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;

        // Apply threshold filter
        if (avg < value) {
          pixel.setRed(0);
          pixel.setGreen(0);
          pixel.setBlue(0);
        } else {
          pixel.setRed(255);
          pixel.setGreen(255);
          pixel.setBlue(255);
        }
      }
    }
  }
  }