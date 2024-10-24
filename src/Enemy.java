import javax.swing.*;

public class Enemy extends Characters{
    public Enemy(){
        super();
    }

    public Enemy(int x, int y, int w, int h, int s, int hp, int d, ImageIcon p, String t, Weapons w1){
        super(x,y,w,h,s,hp,d,p,t,w1);
    }

}
