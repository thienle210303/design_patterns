package strategy;

class Defenceman extends Player{
  
  // Constructor
  public Defenceman(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  public void setOffenceBehavior() {
    int randNum = this.rand.nextInt(10) + 1;
    if (randNum == 1) {
      super.offenceBehavior = new SlapShotBehavior();
    } else {
      super.offenceBehavior = new PassBehavior();
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
    return super.toString() + "play the position Defenceman";
  }
}