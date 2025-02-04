import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
  // 2D Array of character names
   String [][] sanrioCharacters = {
  {"Hello Kitty", "Mimmy", "Chococat"},
  {"Pochacco", "Cinnamoroll", "Pompompurin"},
  {"MyMelody", "Kuromi", "Wish me mell"}
   };
    
// 2d array of years the characters were created
    int [][] yearCreated = {
      {1974, 1974, 1996},
      {1989, 2001, 1996},
      {1975, 2005, 2010}
    };

  // 2d array of images
    ImageFilter[][] info = {
      { new ImageFilter("hellokitty2.jpeg"), new ImageFilter("mimi.png"), new ImageFilter("chococat.png")  },
      { new ImageFilter("pochacco.jpeg"), new ImageFilter("cinnamoroll.jpeg"), new ImageFilter("pompompurin.jpg")  },
      { new ImageFilter("mymelody.png"), new ImageFilter("kuromi.jpeg"), new ImageFilter("wishmemell.jpg")  },
    };

    // MyStory object
    MyStory scene = new MyStory(sanrioCharacters, info);
    
    // Call drawScene
    scene.drawScenes();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}
