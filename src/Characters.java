import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;


public class Characters {
    private int w,h,speed,health,damage,mana,dx,dy;
    private int x,y;
    private double doubleX,doubleY;
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

        dx=0;
        dy=0;
        pic = new ImageIcon();
        type = "";
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int dam, ImageIcon p, String t){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        health=hea;
        damage=dam;
        pic=p;
        dx=0;
        dy=0;
        type = t;
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int dam, ImageIcon p, String t, Weapons weap){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        health=hea;
        damage=dam;
        pic=p;
        dx=0;
        dy=0;
        type = t;
        weapon = weap;
    }

    public Characters(int x, int y, int w, int h, int speed, int health, int damage, int mana, ImageIcon pic, String type) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.speed = speed;
        this.health = health;
        this.damage = damage;
        this.mana = mana;
        this.pic = pic;
        this.type = type;
    }

    public Characters(int x, int y, int h, int w, int speed, int health, int damage, int mana, ImageIcon pic, String type, Weapons weapon) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.speed = speed;
        this.health = health;
        this.damage = damage;
        this.mana = mana;
        this.pic = pic;
        this.type = type;
        this.weapon = weapon;
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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void drawChar(Graphics g2d){
        g2d.drawImage(pic.getImage(),(int)x,(int)y,w,h,null);
    }

    public void drawDoubleChar(Graphics g2d){
        g2d.drawImage(pic.getImage(),(int)doubleX,(int)doubleY,w,h,null);
    }

    public double getDoubleX() {
        return x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getDoubleY() {
        return y;
    }

    public int getY() {
        return y;
    }

    public void setDoubleX(double doubleX) {
        this.doubleX = doubleX;
    }

    public void setDoubleY(double doubleY) {
        this.doubleY = doubleY;
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
