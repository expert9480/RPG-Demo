import javax.swing.*;

public class Zombie extends Enemy {
    public Zombie(){
        super();
    }

    @Override
    public String toString() {
        return "Zombie";
    }

    public Zombie(int x, int y){
        //change the image
        super(x,y,100,100,2,50,10,new ImageIcon("assets/Enemies/zombie.png"),"Zombie",new Melee(),10);
    }
}
