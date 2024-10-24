import javax.swing.*;

public class FireSpell extends Spells{
    public FireSpell(){
        super();
    }
    public FireSpell(int x, int y){
        super(x,y,50,50,10,50,new ImageIcon("assets/Weapons/firespell.png"),"FireSpell");
    }
}
