import javax.swing.*;

public class LongSword extends Weapons{
    public LongSword(){
        super();
    }

    public LongSword(int x, int y){
        super(x, y, 50, 50, 10, 50, 10, new ImageIcon("assets/sword.png"), "Longsword");
    }

    public String toString(){
        return "Sword";
    }
}
