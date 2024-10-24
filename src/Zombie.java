import javax.swing.*;

public class Zombie extends Enemy{
    public Zombie(){
        super();
    }

    @Override
    public String toString() {
        return "Zombie";
    }

    public Zombie(int x, int y){
        //change the image
        super(x,y,50,50,3,50,10,new ImageIcon("assets/Weapons/katana.png"),"Zombie",new Melee());
    }
}
