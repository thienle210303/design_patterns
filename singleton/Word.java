/**
 * The Word class represents a word along with its type, definition, and an example sentence.
 * It provides methods to retrieve the word and its description.
 * @author Thien Le
*/

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Constructs a Word object with the specified word, type, definition, and sentence.
     * @param word       the word itself
     * @param type       the type or part of speech of the word
     * @param definition the definition of the word
     * @param sentence   an example sentence using the word
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Gets the word.
     * @return the word
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Gets the description of the word, including its part of speech, definition, and example sentence.
     * @return the description of the word
     */
    public String getDescription() {
        StringBuilder result = new StringBuilder();
        result.append("Part of Speech: " + this.type);
        result.append("\nDefinition: " + this.definition);
        result.append("\n" + this.sentence);
        return result.toString();
    }
}