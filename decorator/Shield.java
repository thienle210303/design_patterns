package decorator;
import java.util.ArrayList;

/**
 * The Shield class represents a player decorator that adds a shield to a player.
 * It extends the PlayerDecorator class and integrates shield functionality.
 * @author Thien Le
 */
public class Shield extends PlayerDecorator {

    /**
     * Constructs a Shield object for a player.
     * @param player The player to be decorated with a shield.
     */
    public Shield(Player player) {
        super(player);
        // Load shield details from the specified text file
        ArrayList<String> shieldDetails = FileReader.getLines("decorator/assest/shield.txt");
        integrateDecor(shieldDetails);
    }
}
