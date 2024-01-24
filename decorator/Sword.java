package decorator;

import java.util.ArrayList;

/**
 * The Sword class represents a player decorator that adds a sword to a player.
 * It extends the PlayerDecorator class and integrates sword functionality.
 * @author Thien Le
 */
public class Sword extends PlayerDecorator {
    /**
     * Constructs a Sword object for a player.
     * @param player The player to be decorated with a sword.
     */
    public Sword(Player player) {
        super(player);
        // Load sword details from the specified text file
        ArrayList<String> swordDetails = FileReader.getLines("decorator/assest/sword.txt");
        integrateDecor(swordDetails);
    }
}
