package strategy;

import java.util.Random;

public abstract class Player {
  // variable
  private String firstName;
  private String lastName;
  protected DefenseBehavior defenceBehavior;
  protected OffenceBehavior offenceBehavior;
  protected Random rand;

  // constructor
  public Player(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // mutator
  public void setDefenceBehavior() {}

  public void setOffenceBehavior() {}

  // method
  public String play(boolean possession) {
    if(possession) {
      this.setOffenceBehavior();
      return this.offenceBehavior.play();
    } else {
      this.setDefenceBehavior();
      return this.defenceBehavior.play();
    }
  }

  public String toString() {
    return this.firstName + " " + this.lastName + " plays the position: ";
  }
}