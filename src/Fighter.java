import javax.swing.ImageIcon;


public class Fighter extends Characters {
    public Fighter() {
        super();
    }

    public Fighter(int x, int y) {
        super(x, y, 50, 50, 4, 150, 25, new ImageIcon("assets/Characters/cat3.png"),"Fighter", null);
    }

    public Fighter(int x, int y, Weapons weapon) {
        super(x, y, 50, 50, 4, 150, 25, new ImageIcon("assets/Characters/cat1.png"),"Fighter", new LongSword(x+25,y+25));
        super.getWeapon().setX(super.getX()+super.getW());
        super.getWeapon().setY(super.getY()+super.getH());
    }
}
