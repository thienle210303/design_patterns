package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player{
    private Player player;
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        int i = 0;
        StringBuilder temp_line;
        String decor_line;

        for(String line: lines) {
            decor_line = decor.get(i);
            if (decor_line.length() == 0) {
                i++;
                continue;
            }
            
            int min_length = Math.min(decor_line.length(), line.length());
            temp_line = new StringBuilder();
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