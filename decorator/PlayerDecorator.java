package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player{
    private Player player;
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        System.out.println(decor);
    }
}