package strategy;
import java.util.Random;
/*
 * Block behavior class implement defense behavior interface
 * @authors: Thien
 */
public class BlockBehavior implements DefenseBehavior {
  @Override
  public String play() {
    Random rand = new Random();
    int randNum = rand.nextInt(3) + 1;

    if (randNum == 1) {
      return "blocks player from passing";
    } else if (randNum == 2) {
      return "blocks player from shooting";
    } else {
      return "checks player with puck";
    }
  }
}