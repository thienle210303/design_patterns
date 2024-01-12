package strategy;

public class ChasePuckBehavior implements DefenseBehavior {
  @Override
  public String play() {
    return "chases the punk";
  }
}