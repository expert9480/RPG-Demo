import javax.swing.*;

public class FireSpell extends Spells{
    public FireSpell(){
        super();
    }
    public FireSpell(double x, double y, double dx, double dy){
        super(x,y,50,50,1,50,new ImageIcon("assets/Weapons/firespell.png"),"FireSpell",dx,dy);
    }
}
