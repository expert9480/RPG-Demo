import javax.swing.*;

public class PurpleChest extends Chests{
    public PurpleChest() {
        super();
    }

    public PurpleChest(int x, int y) {
        super(x, y, 50, 50, 30, new ImageIcon("assets/Chests/purplechest.png"), "Purple Chest");
    }
}
