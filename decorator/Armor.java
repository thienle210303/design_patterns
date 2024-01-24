package decorator;

import java.util.ArrayList;

/**
 * The Armor class represents a player decorator that adds armor to a player.
 * It extends the PlayerDecorator class and integrates armor functionality.
 * Armor is loaded from a specified text file.
 * 
 * @author: Thien Le
 */
public class Armor extends PlayerDecorator{
    /**
     * Constructs an Armor object for a player.
     * @param player The player to be decorated with armor.
     */
    public Armor(Player player) {
        super(player);
        ArrayList<String> list = FileReader.getLines("decorator/assest/armor.txt");
        integrateDecor(list);
    }
}
