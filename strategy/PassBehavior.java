package strategy;

public class PassBehavior implements OffenceBehavior {
  @Override
  public String play() {
    return "Passes to a forward";
  }
}