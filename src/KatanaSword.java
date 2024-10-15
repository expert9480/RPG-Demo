import javax.swing.*;

public class KatanaSword extends Weapons {
    // Copy code from LongSword.java and into this file but changing the method names
    public KatanaSword() {
        super();
    }

    public KatanaSword(int x, int y) {
        super(x, y, 50, 50, 10, 50, 10, new ImageIcon("assets/sword.png"), "Katana");
    }
}