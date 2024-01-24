package decorator;

/**
 * The Warrior class represents a concrete implementation of a player as a warrior.
 * It extends the Player class and initializes warrior details from a text file.
 * @author: Thien Le
 */
public class Warrior extends Player {
    /**
     * Constructs a Warrior object with the specified name.
     * @param name The name of the warrior player.
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/assest/warrior.txt"), name);
    }
}
