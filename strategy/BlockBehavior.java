import java.util.Random;

public class BlockBehavior implements defenceBehavior {
  public String play() {
    String returnBehavior = "blocks player from ";
    Random rand = new Random();
    int randNum = random.nextInt(3) + 1;

    switch (randNum) {
      case 1:
        returnBehavior += "passing";
        break;
      case 2:
        returnBehavior += "shooting";
        break;
      case 3:
        returnBehavior += "puck";
        break;
    }

    return returnBehavior;
  }
}