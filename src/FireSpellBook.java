import javax.swing.*;

public class FireSpellBook extends Weapons {
    // Copy code from LongSword.java and into this file but changing the method names
    public FireSpellBook() {
        super();
    }

    public FireSpellBook(int x, int y) {
        super(x, y, 50, 50, 10, 50, 10, new ImageIcon("assets/sword.png"), "Fire Spell Book");
    }
}
