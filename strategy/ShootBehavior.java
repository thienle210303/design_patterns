package strategy;

public class ShootBehavior implements OffenceBehavior {
  @Override
  public String play() {
    return "Shoots at the goal";
  }
}