import javax.swing.*;

//does dot damage
public class FireSpellBook extends Weapons {
    // Copy code from LongSword.java and into this file but changing the method names
    public FireSpellBook() {
        super();
    }

    public FireSpellBook(int x, int y) {
        super(x, y, 50, 50, 4, 50, 12, new ImageIcon("assets/Weapons/firespellbook.png"), "Fire Spell Book","Mage");
    }
}
