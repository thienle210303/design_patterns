package strategy;

/*
 * Slap shot behavior class implements offence behavior and defense behavior interface
 * @authors: Thien
 */
public class SlapShotBehavior implements OffenceBehavior, DefenseBehavior {
  @Override
  public String play() {
    return "Shoots the puck from the blue line";
  }
}