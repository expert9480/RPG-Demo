import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;


public class Characters {
    private int x,y,w,h,speed,health,damage,stam,dx,dy;
    private ImageIcon pic;
    private String type;
    private Weapons weapon;

    public Characters(){
        x=0;
        y=0;
        w=0;
        h=0;
        speed=0;
        health=0;
        damage=0;
        stam=0;
        dx=0;
        dy=0;
        pic = new ImageIcon();
        type = "";
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int dam, int st, ImageIcon p, String t){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        health=hea;
        damage=dam;
        stam=st;
        pic=p;
        dx=0;
        dy=0;
        type = t;
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int dam, int st, ImageIcon p, String t, Weapons weap){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        health=hea;
        damage=dam;
        stam=st;
        pic=p;
        dx=0;
        dy=0;
        type = t;
        weapon = weap;
    }

    public void move(int screenW, int screenH, int maxW, int maxH) {
        //fix move method
        x+=dx;
        if (x+w>maxW) {
            x=maxW-w;
        }
        else if (x<screenW){
            x=screenW;
        }

        y+=dy;
        //
        if (y+h>maxH)
            y=maxH-h;
        else if (y<screenH-(h/2))
            y=screenH-(h/2);
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void drawChar(Graphics g2d){
        g2d.drawImage(pic.getImage(),x,y,w,h,null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStam() {
        return stam;
    }

    public void setStam(int stam) {
        this.stam = stam;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }
}
