import javax.swing.*;

public class MetalBat extends Weapons {
    // Copy code from LongSword.java and into this file but changing the method names
    public MetalBat() {
        super();
    }

    public MetalBat(int x, int y) {
        super(x, y, 50, 50, 10, 50, 10, new ImageIcon("assets/sword.png"), "Metal Bat");
    }
}

