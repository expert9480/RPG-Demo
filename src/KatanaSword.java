import javax.swing.*;

public class KatanaSword extends Weapons {
    public KatanaSword() {
        super();
    }

    public KatanaSword(int x, int y) {
        super(x, y, 50, 50, 7, 50, 15, new ImageIcon("assets/Weapons/katana.png"), "Katana","Fighter");
    }
}