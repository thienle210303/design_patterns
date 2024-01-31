package state;

/**
 * Class representing the state of the spelling game in the first grade.
 * It extends the abstract State class and provides specific implementations
 * for loading words, increasing grade, and decreasing grade at the first grade level.
 * @author Thien Le
 */
public class FirstGradeState extends State{
    /**
     * Constructor for the FirstGradeState class.
     * Initializes the state with the provided spelling list and loads words from the first-grade file.
     * @param spellingList The spelling list associated with the first-grade state.
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/assest/first.txt");
    }

    /**
     * Increases the grade level to second grade.
     * Sets the current state to the second grade state.
     */
    public void increaseGrade() {
        System.out.println("You are up to second grade");
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }

    /**
     * Decreases the grade level.
     * As the first grade is the lowest grade, it prints a message indicating the lowest grade reached.
     */
    public void decreaseGrade() {
        System.err.println("This is lowest grade. You can't go any lower");
    }
}
