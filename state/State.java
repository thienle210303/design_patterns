package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract class representing the state of a spelling game.
 * This class provides a basic structure for different game states.
 * @author Thien Le
 */
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * Constructor for the State class.
     * @param spellingList The spelling list associated with the game state.
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.words = new ArrayList<>();
        this.rand = new Random();
    }

    /**
     * Gets the next word for the spelling game.
     * @return A randomly selected word from the list.
     */
    public String getNextWord() {
        Integer index = rand.nextInt(this.words.size());
        return words.get(index);
    }

    /**
     * Abstract method to increase and decrease the grade or score in the game.
     */
    public void increaseGrade() {}
    public void decreaseGrade() {}

}
