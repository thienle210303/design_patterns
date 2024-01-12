package strategy;

public class SlapShotBehavior implements OffenceBehavior, DefenseBehavior {
  @Override
  public String play() {
    return "Shoots the puck from the blue line";
  }
}