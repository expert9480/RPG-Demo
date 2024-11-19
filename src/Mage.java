import javax.swing.ImageIcon;


public class Mage extends Characters{
    public Mage(){
        super();
    }

    public Mage(int x, int y){
        super(x,y,50,50,3,100,20, 100, new ImageIcon("assets/Characters/cat1.png"),"Mage");
    }
}
