import javax.swing.*;

public class MetalBat extends Weapons {
    public MetalBat() {
        super();
    }

    public MetalBat(int x, int y) {
        super(x, y, 50, 50, 7, 50, 20, new ImageIcon("assets/Weapons/metalbat.png"), "Metal Bat","Scout");
    }
}

