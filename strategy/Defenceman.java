package strategy;

/*
 * Defenceman child of Player class
 */
class Defenceman extends Player{
  // Constructor
  public Defenceman(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  @Override
  public void setOffenceBehavior() {
    // 90% of slap shot behavior
    // 10% of pass behavior
    int randNum = this.rand.nextInt(10) + 1;
    if (randNum == 1) {
      super.offenceBehavior = new SlapShotBehavior();
    } else {
      super.offenceBehavior = new PassBehavior();
    }
    super.defenceBehavior = null;
  }

  @Override
  public void setDefenceBehavior() {
    // 50% of chase puck behavior
    // 50% of block behavior
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