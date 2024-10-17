import javax.swing.*;

public class WoodenBat extends Weapons {
    // Copy code from LongSword.java and into this file but changing the method names
    public WoodenBat() {
        super();
    }

    public WoodenBat(int x, int y) {
        super(x, y, 50, 50, 9, 50, 18, new ImageIcon("assets/woodenbat.png"), "Wooden Bat","Scout");
    }
}
