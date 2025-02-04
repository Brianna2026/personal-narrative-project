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

      // Creating the image and putting them on the theater
  ImageFilter helloKitty = new ImageFilter("hellokitty2.jpeg");
  drawImage(helloKitty, 20, 50 ,170);
      
  ImageFilter mimmy = new ImageFilter("mimi.png");
   drawImage(mimmy, 200, 80 ,170);
      
  ImageFilter chococat = new ImageFilter("chococat.png");
      drawImage(chococat, 120, 210 ,150);

      pause (2);

      // Applies the filter and shows the picture on the theater
       helloKitty.adjustContrast(20);
       drawImage(helloKitty, 20, 50 ,170);
      
       mimmy.adjustContrast(20);
       drawImage(mimmy, 220, 80 ,170);
      
       chococat.adjustContrast(20);
      drawImage(chococat, 120, 210 ,150);
      
      pause(2); // Pause before next scene


      // Setting the second scene
       clear("white");
      setTextHeight(30);
      setTextColor("black");
      setTextStyle(Font.SANS, FontStyle.BOLD);
      drawText("Sanrio Dog Characters", 40, 40);


      // Creating images and drawing them on the theater
  ImageFilter pochacco = new ImageFilter("pochacco.jpeg");
  drawImage(pochacco, 20, 50 ,170);

  ImageFilter cinnamoroll = new ImageFilter("cinnamoroll.jpeg");
  drawImage(cinnamoroll, 200, 50 ,170);

  ImageFilter pompompurin = new ImageFilter("pompompurin.jpg");
  drawImage(pompompurin, 120, 230 ,140);

      pause(2);

      // Applies the negative filter on images
      pochacco.makeNegative();
      drawImage(pochacco, 20, 50 ,170);
      
      cinnamoroll.makeNegative();
      drawImage(cinnamoroll, 200, 50 ,170);

      pompompurin.makeNegative();
      drawImage(pompompurin, 120, 230 ,140);
      
      pause(2); // pause before next scene


      // Setting third scene
       clear("white");
      setTextHeight(30);
      setTextColor("black");
      setTextStyle(Font.SANS, FontStyle.BOLD);
      drawText("Sanrio Bunny Characters", 25, 40);

      // Creating images and adding them on the scene
  ImageFilter mymelody = new ImageFilter("mymelody.png");
  drawImage(mymelody, 20, 50 ,120);

  ImageFilter kuromi = new ImageFilter("kuromi.jpeg");
  drawImage(kuromi, 200, 60 ,190);

  ImageFilter wishmemell = new ImageFilter("wishmemell.jpg");
  drawImage(wishmemell, 120, 210 ,140);
      pause(2);

      // Applies threshold filter on the slide
      mymelody.threshold(6);
      drawImage(mymelody, 20, 50 ,120);

      kuromi.threshold(20);
      drawImage(kuromi, 200, 60 ,190);
      
      wishmemell.threshold(4);
      drawImage(wishmemell, 120, 210 ,140);
      pause(2); // Pause to show change
    }
  }
}