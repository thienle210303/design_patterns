package state;

/**
 * Class representing the Spelling List for the spelling game.
 * It maintains the current state of the game (grade level) and provides methods
 * to get the next word, increase grade, decrease grade, and set the game state.
 * @author Thien Le
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Constructor for the SpellingList class.
     * Initializes the different grade states and sets the initial state to first grade.
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        this.state = firstGradeState;
    }

    /**
     * Gets the next word from the current state.
     * @return A word from the current grade state.
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Increase or decrease the grade level in the game
     */
    public void increaseGrade() { state.increaseGrade(); }
    public void decreaseGrade() { state.decreaseGrade(); }

    /**
     * Get the instances of the grade
     * @return The grade instance
     */
    public State getFirstGradeState() { return this.firstGradeState; }
    public State getSecondGradeState() { return this.secondGradeState; }
    public State getThirdGradeState() { return this.thirdGradeState; }

    /**
     * Sets the current state of the game.
     * @param state The new state for the game.
     */
    public void setState(State state) {
        this.state = state;
    }

}