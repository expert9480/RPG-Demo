import javax.swing.*;

public class IceSpell extends Spells{
    public IceSpell(){
        super();
    }
    public IceSpell(int x, int y, int dx, int dy){
        super(x,y,50,50,1,50,new ImageIcon("assets/Weapons/firespell.png"),"IceSpell",dx,dy);
    }
}
