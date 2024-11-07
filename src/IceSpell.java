import javax.swing.*;

public class IceSpell extends Spells{
    public IceSpell(){
        super();
    }
    public IceSpell(double x, double y, double dx, double dy){
        super(x,y,50,50,1,50,new ImageIcon("assets/Weapons/icespell.png"),"IceSpell",dx,dy);
    }
}
