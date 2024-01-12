package strategy;

import java.util.Random;

/*
 * Player class is parent of Goalie, Forward and Defenceman
 * @authors: Thien
 */
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
    this.rand = new Random();
  }

  // mutator
  public void setDefenceBehavior() {}
  public void setOffenceBehavior() {}

  // method
  /*
   * Play function represent the action based on possession
   * @return: the string of action based on possession
   */
  public String play(boolean possession) {
    if(possession) {
      this.setOffenceBehavior();
      return this.offenceBehavior.play();
    } else {
      this.setDefenceBehavior();
      return this.defenceBehavior.play();
    }
  }

  /*
   * toString method to return the player name with the position
   * @returns: the string of player name with the position
   */
  public String toString() {
    return this.firstName + " " + this.lastName + " plays the position: ";
  }
}