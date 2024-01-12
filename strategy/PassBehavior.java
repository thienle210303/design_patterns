package strategy;

/*
 * Pass behavior class implements offence behavior interface
 * @authors: Thien
 */
public class PassBehavior implements OffenceBehavior {
  @Override
  public String play() {
    return "Passes to a forward";
  }
}