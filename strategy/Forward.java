package strategy;

public class Forward extends Player{
  
  // Constructor
  public Forward(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  public void setOffenceBehavior() {
    int randNum = this.rand.nextInt(2) + 1;
    if (randNum == 1) {
      super.offenceBehavior = new PassBehavior();
    } else {
      super.offenceBehavior = new ShootBehavior();
    }
    super.defenceBehavior = null;
  }

  public void setDefenceBehavior() {
    int randNum = this.rand.nextInt(2) + 1;
    if (randNum == 1) {
      super.defenceBehavior = new ChasePuckBehavior();
    } else {
      super.defenceBehavior = new BlockBehavior();
    }
    super.offenceBehavior = null;
  }

  public String toString() {
    return super.toString() + "plays the position Forward";
  }
}