package strategy;
/**
 * Forward class child of Player class
 */
public class Forward extends Player{
  // Constructor
  public Forward(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  @Override
  public void setOffenceBehavior() {
    // Fair percentage of Pass and shoot behavior
    int randNum = this.rand.nextInt(2) + 1;
    if (randNum == 1) {
      super.offenceBehavior = new PassBehavior();
    } else {
      super.offenceBehavior = new ShootBehavior();
    }
    super.defenceBehavior = null;
  }

  @Override
  public void setDefenceBehavior() {
    // Fair percentage of chasePuck and block behavior
    int randNum = this.rand.nextInt(2) + 1;
    if (randNum == 1) {
      super.defenceBehavior = new ChasePuckBehavior();
    } else {
      super.defenceBehavior = new BlockBehavior();
    }
    super.offenceBehavior = null;
  }

  @Override
  public String toString() {
    return super.toString() + "plays the position Forward";
  }
}