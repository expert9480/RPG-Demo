import javax.swing.*;

//slows enemies
public class IceSpellBook extends SpellBooks {
    public IceSpellBook() {
        super();
    }

    public IceSpellBook(int x, int y) {
        super(x, y, 50, 50, 6, 50, 11, new ImageIcon("assets/Weapons/icespellbook.png"), "Ice Spell Book","Mage", 10);
    }
}
