import javax.swing.*;

public class RedChest extends Chests{
    public RedChest() {
        super();
    }

    public RedChest(int x, int y) {
        super(x, y, 50, 50, 10, new ImageIcon("assets/Chests/redchest.png"), "Red Chest", new ImageIcon("assets/Chests/redchestopen.png"));
    }
}
