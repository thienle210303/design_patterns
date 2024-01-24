package decorator;

import java.util.ArrayList;

/**
 * The Player class is an abstract class representing a player in the game.
 * It provides a basic structure for player objects with a name and lines of text.
 *
 * @author Thien Le
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Constructs a Player object with specified lines and name.
     * @param lines The lines of text associated with the player.
     * @param name  The name of the player.
     */
    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

     /**
     * Gets the name of the player.
     * @return The name of the player.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Converts the player object to a string representation.
     * @return A string representation of the player.
     */
    public String toString() {
        StringBuilder returnSTR = new StringBuilder();
        for(String line: lines) {
            returnSTR.append("\n" + line);
        }
        return returnSTR.toString();
    }
}
