import javax.swing.*;

//does dot damage
public class FireSpellBook extends SpellBooks {
    public FireSpellBook() {
        super();
    }

    public FireSpellBook(int x, int y) {
        super(x, y, 50, 50, 5, 50, 12, new ImageIcon("assets/Weapons/firespellbook.png"), "Fire Spell Book","Mage", 10);
    }
}
