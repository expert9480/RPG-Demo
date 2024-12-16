import javax.swing.ImageIcon;


public class Mage extends Characters{
    public Mage(){
        super();
    }

    public Mage(int x, int y){
        super(x,y,50,50,3,100,20, 100, new ImageIcon("assets/Characters/cat1.png"),"Mage", new ImageIcon("assets/Characters/Mage/back_walk_mage.gif"), new ImageIcon("assets/Characters/Mage/front_walk_mage.gif"), new ImageIcon("assets/Characters/Mage/left_walk_mage.gif"), new ImageIcon("assets/Characters/Mage/right_walk_mage.gif"), new ImageIcon("assets/Characters/Mage/back_idle_mage.png"), new ImageIcon("assets/Characters/Mage/front_idle_mage.gif"), new ImageIcon("assets/Characters/Mage/left_idle_mage.png"), new ImageIcon("assets/Characters/Mage/right_idle_mage.png"));
    }
}
