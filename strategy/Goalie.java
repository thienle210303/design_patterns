package strategy;

public class Goalie extends Player{
  
  // Constructor
  public Goalie(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  public void setOffenceBehavior() {
    super.offenceBehavior = new BlockGoalBehavior();
  }

  public void setDefenceBehavior() {
    super.defenceBehavior = new BlockGoalBehavior();
  }

  public String toString() {
    return super.toString() + "plays the position: Goalie";
  }
}