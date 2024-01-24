package decorator;

import java.util.ArrayList;

public class Sword extends PlayerDecorator {
    public Sword(Player player) {
        super(player);
        ArrayList<String> list = FileReader.getLines("decorator/assest/sword.txt");
        integrateDecor(list);
    }
}
