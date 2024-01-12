package strategy;
import java.util.Random;

public class BlockBehavior implements DefenseBehavior {
  public String play() {
    Random rand = new Random();
    int randNum = rand.nextInt(3) + 1;
    // int randNum = super.rand.nextInt(3) + 1;

    if (randNum == 1) {
      return "blocks player from passing";
    } else if (randNum == 2) {
      return "blocks player from shooting";
    } else {
      return "checks player with puck";
    }
  }
}