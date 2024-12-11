import javax.swing.ImageIcon;


public class Fighter extends Characters {
    public Fighter() {
        super();
    }

//    public Fighter(int x, int y) {
//        super(x, y, 50, 50, 4, 150, 25, new ImageIcon("assets/Characters/cat3.png"),"Fighter");
//    }

    public Fighter(int x, int y) {
        super(x, y, 50, 50, 4, 150, 25, new ImageIcon("assets/Characters/cat3.png"),"Fighter", new ImageIcon("assets/Characters/Fighter/walking_facing_backward_gif_fighter.gif"), new ImageIcon("assets/Characters/Fighter/Foward_walking_gif_fighter.gif"), new ImageIcon("assets/Characters/Fighter/walking_facing_left_fighter.gif"), new ImageIcon("assets/Characters/Fighter/walking_facing_right_fighter.gif"), new ImageIcon("assets/Characters/Fighter/idle_backwards_pose_fighter.png"), new ImageIcon("assets/Characters/Fighter/Front_facing_idle_sprite_heavy.png"), new ImageIcon("assets/Characters/Fighter/idle_facing_left_figher.png"), new ImageIcon("assets/Characters/Fighter/idle_facing_right_fighter.png"));
    }

//    public Fighter(int x, int y, Weapons weapon) {
//        super(x, y, 50, 50, 4, 150, 25, new ImageIcon("assets/Characters/cat1.png"),"Fighter", new LongSword(x+25,y+25));
//        super.getWeapon().setX(super.getX()+super.getW());
//        super.getWeapon().setY(super.getY()+super.getH());
//    }
}
