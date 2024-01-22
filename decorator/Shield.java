package decorator;

import java.util.ArrayList;

public class Shield extends PlayerDecorator{
    public Shield(Player player) {
        super(player);
        ArrayList<String> list = FileReader.getLines("decorator/shield.txt");
        integrateDecor(list);
    }
}
