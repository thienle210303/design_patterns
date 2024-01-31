package state;

/**
 * Class representing the state of the spelling game in the third grade.
 * It extends the abstract State class and provides specific implementations
 * for loading words, increasing grade, and decreasing grade at the third-grade level.
 * @author Thien Le
 */
public class ThirdGradeState extends State {
    /**
     * Constructor for the ThirdGradeState class.
     * Initializes the state with the provided spelling list and loads words from the third-grade file.
     * @param spellingList The spelling list associated with the third-grade state.
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/assest/third.txt");
    }

    /**
     * Increases the grade level.
     * As the third grade is the highest grade, it prints a message indicating the highest grade reached.
     */
    public void increaseGrade() {
        System.err.println("This is highest grade. You can't go any higher");
    }

    /**
     * Decreases the grade level to second grade.
     * Sets the current state to the second grade state.
     */
    public void decreaseGrade() {
        System.out.println("You are down to second grade");
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }
}
