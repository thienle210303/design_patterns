package strategy;
import java.util.Random;

public class BlockGoalBehavior implements OffenceBehavior, DefenseBehavior {
  @Override
  public String play() {
    Random rand = new Random();
    int randNum = rand.nextInt(4) + 1;
    // randomly return
    if(randNum == 1) {
      return "hand blocks the puck";
    } else if(randNum == 2) {
      return "catches the puck";
    } else if(randNum == 3) {
      return "blocks puck with knee pads";
    }
    return "blocks puck with stick";
  }
}