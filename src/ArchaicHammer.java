import javax.swing.*;

public class ArchaicHammer extends Weapons {
    public ArchaicHammer() {
        super();
    }

    public ArchaicHammer(int x, int y) {
        super(x, y, 50, 50, 17, 50, 18, new ImageIcon("assets/Weapons/archaichammer.png"), "Archaic Hammer","Heavy");
    }
}
