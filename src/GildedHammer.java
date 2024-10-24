import javax.swing.*;

public class GildedHammer extends Weapons {
    public GildedHammer() {
        super();
    }

    public GildedHammer(int x, int y) {
        super(x, y, 50, 50, 20, 50, 20, new ImageIcon("assets/Weapons/gildedhammer.png"), "Gilded Hammer","Heavy");
    }
}
