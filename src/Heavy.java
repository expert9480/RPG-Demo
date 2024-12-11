import javax.swing.ImageIcon;


public class Heavy extends Characters {
    public Heavy() {
        super();
    }

    public Heavy(int x, int y) {
        super(x, y, 50, 50, 2, 200, 60, new ImageIcon("assets/Characters/cat2.png"), "Heavy", new ImageIcon("assets/Characters/Heavy/walking_backwards_heavy.gif"), new ImageIcon("assets/Characters/Heavy/walking_forwards_heavy.gif"), new ImageIcon("assets/Characters/Heavy/walking_facing_left_heavy.gif"), new ImageIcon("assets/Characters/Heavy/walking_facing_right_heavy.gif"), new ImageIcon("assets/Characters/Heavy/backwards_idle_heavy.png"), new ImageIcon("assets/Characters/Heavy/idle_heavy_sprite.gif"), new ImageIcon("assets/Characters/Heavy/idle_facing_left_heavy.png"), new ImageIcon("assets/Characters/Heavy/idle_facing_right_heavy.png"));
    }
}
