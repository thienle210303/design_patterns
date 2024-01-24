package decorator;

import java.util.ArrayList;

/**
 * The PlayerDecorator class is an abstract class representing a decorator for a player in the game.
 * It extends the Player class and provides a mechanism to integrate decoration details.
 * @author: Thien Le
 */
public abstract class PlayerDecorator extends Player{
    private Player player;
    
    /**
     * Constructs a PlayerDecorator object for a player.
     * @param player The player to be decorated.
     */
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    /**
     * Integrates decoration details into the player's lines.
     * @param decor The decoration details to be integrated.
     */
    protected void integrateDecor(ArrayList<String> decor) {
        int i = 0;
        for(String line: this.player.lines) {
            String decor_line = decor.get(i);
            if (decor_line.length() == 0) {
                i++;
                continue;
            }
            
            int min_length = Math.min(decor_line.length(), line.length());
            StringBuilder temp_line = new StringBuilder();
            int j = 0;

            while (j < min_length) {
                char decor_char = decor_line.charAt(j);
                char line_char = line.charAt(j);
                temp_line.append((decor_char != ' ') ? decor_char : line_char);
                j++;
            }
            
            // temp_line.append(j > decor_line.length() ? line.substring(j) : decor_line.substring(j));
            temp_line.append(decor_line.substring(j));
            temp_line.append(line.substring(j));

            lines.set(i, temp_line.toString());
            i++;
        }
    }
}