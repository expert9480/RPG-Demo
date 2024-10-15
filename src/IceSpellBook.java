import javax.swing.*;

public class IceSpellBook extends Weapons {
    // Copy code from LongSword.java and into this file but changing the method names
    public IceSpellBook() {
        super();
    }

    public IceSpellBook(int x, int y) {
        super(x, y, 50, 50, 10, 50, 10, new ImageIcon("assets/sword.png"), "Ice Spell Book");
    }
}
