package strategy;

/*
 * Chase Puck behavior class implements defense behavior interface
 * @authors: Thien
 */
public class ChasePuckBehavior implements DefenseBehavior {
  @Override
  public String play() {
    return "chases the punk";
  }
}