import javax.swing.*;

public class WoodenBat extends Weapons {
    public WoodenBat() {
        super();
    }

    public WoodenBat(int x, int y) {
        super(x, y, 50, 50, 9, 50, 18, new ImageIcon("assets/Weapons/woodenbat.png"), "Wooden Bat","Scout");
    }
}
