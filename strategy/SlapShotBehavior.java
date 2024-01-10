package strategy;

public class SlapShotBehavior implements OffenceBehavior, DefenseBehavior {
  public String play() {
    return "Shoots the puck from the blue line";
  }
}