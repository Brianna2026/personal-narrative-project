import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {
  
  // Instance Variables
  private String[][] characters;
  private ImageFilter[][] images;
  
  // Constructor
  public MyStory(String[][] characters, ImageFilter[][] images) {
    this.characters = characters;
    this.images = images;
  }

  // Method to display scenes
  public void drawScenes() {
    for (int row = 0; row < characters.length; row++) {
        // Clear screen and set background color
        clear("black");

        // Text settings for intro scene
        setTextHeight(30);
        setTextColor("white");
        setTextStyle(Font.SANS, FontStyle.BOLD);
        drawText("My Favorite", 20, 70);
        drawText("Sanrio Characters", 20, 100);
        pause(2);

        // Setting first scene
        clear("white");
        setTextHeight(30);
        setTextColor("black");
        setTextStyle(Font.SANS, FontStyle.BOLD);
        drawText("Sanrio Cat Characters", 40, 40);

        // Use toUpperCase() to show character names in uppercase
        String upperName = characters[row][0].toUpperCase();
        drawText(upperName, 20, 70);  // This will display the character name in uppercase

        // Creating the image and putting them on the theater
        ImageFilter helloKitty = new ImageFilter("hellokitty2.jpeg");
        drawImage(helloKitty, 20, 50, 170);

        ImageFilter mimmy = new ImageFilter("mimi.png");
        drawImage(mimmy, 200, 80, 170);

        ImageFilter chococat = new ImageFilter("chococat.png");
        drawImage(chococat, 120, 210, 150);

        pause(2);

        // Applies the filter and shows the picture on the theater
        helloKitty.adjustContrast(20);
        drawImage(helloKitty, 20, 50, 170);

        // Use equals() to check if the character is Hello Kitty
        if (characters[row][0].equals("Hello Kitty")) {
            drawText("This is Hello Kitty!", 20, 100);  // Display a special message for Hello Kitty
        }

        mimmy.adjustContrast(20);
        drawImage(mimmy, 220, 80, 170);

        chococat.adjustContrast(20);
        drawImage(chococat, 120, 210, 150);

        pause(2); // Pause before next scene

        // Setting the second scene
        clear("white");
        setTextHeight(30);
        setTextColor("black");
        setTextStyle(Font.SANS, FontStyle.BOLD);
        drawText("Sanrio Dog Characters", 40, 40);

        // Creating images and drawing them on the theater
        ImageFilter pochacco = new ImageFilter("pochacco.jpeg");
        drawImage(pochacco, 20, 50, 170);

        ImageFilter cinnamoroll = new ImageFilter("cinnamoroll.jpeg");
        drawImage(cinnamoroll, 200, 50, 170);

        ImageFilter pompompurin = new ImageFilter("pompompurin.jpg");
        drawImage(pompompurin, 120, 230, 140);

        pause(2);

        // Applies the negative filter on images
        pochacco.makeNegative();
        drawImage(pochacco, 20, 50, 170);

        cinnamoroll.makeNegative();
        drawImage(cinnamoroll, 200, 50, 170);

        pompompurin.makeNegative();
        drawImage(pompompurin, 120, 230, 140);

        pause(2); // Pause before next scene

        // Setting third scene
        clear("white");
        setTextHeight(30);
        setTextColor("black");
        setTextStyle(Font.SANS, FontStyle.BOLD);
        drawText("Sanrio Bunny Characters", 25, 40);

        // Creating images and adding them on the scene
        ImageFilter mymelody = new ImageFilter("mymelody.png");
        drawImage(mymelody, 20, 50, 120);

        ImageFilter kuromi = new ImageFilter("kuromi.jpeg");
        drawImage(kuromi, 200, 60, 190);

        ImageFilter wishmemell = new ImageFilter("wishmemell.jpg");
        drawImage(wishmemell, 120, 210, 140);

        pause(2);

        // Use substring() to display part of the name
        String partName = characters[row][0].substring(0, 4);  // Display first 4 characters of the name
        drawText("Part of the name: " + partName, 20, 250);

        // Applies threshold filter on the slide
        mymelody.threshold(6);
        drawImage(mymelody, 20, 50, 120);

        kuromi.threshold(20);
        drawImage(kuromi, 200, 60, 190);

        wishmemell.threshold(4);
        drawImage(wishmemell, 120, 210, 140);
        pause(2); // Pause to show change
    }
}