import javax.swing.*;

public class BlueChest extends Chests{
    public BlueChest() {
        super();
    }

    public BlueChest(int x, int y) {
        super(x, y, 50, 50, 20, new ImageIcon("assets/Chests/bluechest.png"), "Blue Chest");
    }
}
