import java.util.ArrayList;
import java.util.Random;

/**
 * The FlashCards class manages a collection of words for flashcards.
 * It provides functionality to retrieve a random word.
 * @author Thien Le
 */
public class FlashCards {
    private static FlashCards flashCards;
    private Random rand;
    private ArrayList<Word> words;
    private Word currentWord; // I don't know why exists :)

    /**
     * Constructs a FlashCards object and initializes the list of words.
     */
    private FlashCards() {
        this.words = FileReader.getWords();
    }

    /**
     * Gets the instance of the FlashCards class.
     * @return the instance of FlashCards
     */
    public static FlashCards getInstance() {
        return flashCards != null ? flashCards : new FlashCards();
    }

    /**
     * Retrieves a random word from the collection of words.
     * @return a random word
     */
    public Word getWord() {
        this.rand = new Random();
        Integer randNum = rand.nextInt(0, words.size());
        this.currentWord = words.get(randNum);
        return this.currentWord;
    }

}
