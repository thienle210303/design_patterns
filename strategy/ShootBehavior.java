package strategy;

/*
 * Shoot behavior implements offence behavior
 * @authors: Thien
 */
public class ShootBehavior implements OffenceBehavior {
  @Override
  public String play() {
    return "Shoots at the goal";
  }
}