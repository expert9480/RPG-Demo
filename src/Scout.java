import javax.swing.*;


public class Scout extends Characters{
    public Scout(){
        super();
    }

    public Scout(int x, int y){
        super(x,y,50,50,6,100,20, new ImageIcon("assets/Characters/cat3.png"),"Scout", new ImageIcon("assets/Characters/Scout/walking_back_facing_SCOUT.gif"), new ImageIcon("assets/Characters/Scout/walking_front_facing_SCOUT.gif"), new ImageIcon("assets/Characters/Scout/walking_left_Scout.gif"), new ImageIcon("assets/Characters/Scout/walking_right_scout.gif"), new ImageIcon("assets/Characters/Scout/idle_back_facing_SCOUT.gif"), new ImageIcon("assets/Characters/Scout/idle_front_facing_SCOUT.gif"), new ImageIcon("assets/Characters/Scout/idle_facing_left_scout.png"), new ImageIcon("assets/Characters/Scout/idle_facing_right_scout.png"));
    }
}
