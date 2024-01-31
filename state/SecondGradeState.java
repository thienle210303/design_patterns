package state;

/**
 * Class representing the state of the spelling game in the second grade.
 * It extends the abstract State class and provides specific implementations
 * for loading words, increasing grade, and decreasing grade at the second-grade level.
 * @author Thien Le
 */
public class SecondGradeState extends State{
    /**
     * Constructor for the SecondGradeState class.
     * Initializes the state with the provided spelling list and loads words from the second-grade file.
     * @param spellingList The spelling list associated with the second-grade state.
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/assest/second.txt");
    }

    /**
     * Increases the grade level to third grade.
     * Sets the current state to the third grade state.
     */
    public void increaseGrade() {
        System.out.println("You are up to third grade");
        this.spellingList.setState(this.spellingList.getThirdGradeState());
    }

    /**
     * Decreases the grade level to first grade.
     * Sets the current state to the first grade state.
     */
    public void decreaseGrade() {
        System.out.println("You are down to first grade");
        this.spellingList.setState(this.spellingList.getFirstGradeState());        
    }
}
