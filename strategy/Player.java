package strategy;

import java.util.Random;

public abstract class Player {
  // variable
  private String firstName;
  private String lastName;
  protected DefenceBehavior defenceBehavior;
  protected OffenceBehavior offenceBehavior;
  protected Random rand;

  // constructor
  public Player(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // mutator
  public void setDefenceBehavior() {

  }

  public void setOffenceBehavior() {
  
  }

  // method
  public String play(boolean possession) {
    return "";
  }

  public String toString() {
    return "";
  }
}