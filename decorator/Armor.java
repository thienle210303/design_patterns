package decorator;

import java.util.ArrayList;

public class Armor extends PlayerDecorator{
    public Armor(Player player) {
        super(player);
        ArrayList<String> list = FileReader.getLines("decorator/assest/armor.txt");
        integrateDecor(list);
    }
}
