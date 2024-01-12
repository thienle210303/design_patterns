package strategy;
/*
 * Goalie class is child of Player class
 * @authors: Thien
 */
public class Goalie extends Player{
  // Constructor
  public Goalie(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  // set both of offence and defence to block goal behavior
  @Override
  public void setOffenceBehavior() {
    super.offenceBehavior = new BlockGoalBehavior();
    super.defenceBehavior = null;
  }

  @Override
  public void setDefenceBehavior() {
    super.defenceBehavior = new BlockGoalBehavior();
    super.offenceBehavior = null;
  }

  @Override
  public String toString() {
    return super.toString() + "plays the position: Goalie";
  }
}