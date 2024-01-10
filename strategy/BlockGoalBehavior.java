package strategy;

class BlockGoalBehavior implements OffenceBehavior, DefenseBehavior {
  public String play() {
    return "Blocks goal";
  }
}