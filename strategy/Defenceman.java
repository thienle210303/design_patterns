package strategy;

import java.util.Random;

class Defenceman extends Player{
  
  // Constructor
  public Defenceman(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  // mutator
  public void setOffenceBehavior() {
    Random rand = new Random();
    int randNum = rand.nextInt(10) + 1;
    if (randNum == 1) {
      super.offenceBehavior = new PassBehavior();
    } else {
      super.offenceBehavior = new SlapShotBehavior();
    }
  }

  public void setDefenceBehavior() {
    Random rand = new Random();
    int randNum = rand.nextInt(2) + 1;
    if (randNum == 1) {
      super.defenceBehavior = new ChasePuckBehavior();
    } else {
      super.defenceBehavior = new BlockBehavior();
    }
  }

  public String toString() {
    return super.toString() + "play the position Defenceman";
  }
}