import javax.swing.*;
import java.awt.*;


public class Weapons {

    private int x,y,width,height, damage, range, speed, mana;
    private String type, character;
    private ImageIcon pic;

    public Weapons(){
        x=0;
        y=0;
        width=0;
        height=0;
        damage = 0;
        range = 0;
        speed = 0;
        pic = new ImageIcon();
        type = "";
        character = "";

    }

    public Weapons(int x, int y, int width, int height, int damage, int range, int speed, ImageIcon pic, String type, String character) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.damage = damage;
        this.range = range;
        this.speed = speed;
        this.type = type;
        this.character = character;
        this.pic = pic;
    }

    public Weapons(int xV, int yV, int w, int h, int d, int r, int s, ImageIcon p, String t, String c, int mana){
        x=xV;
        y=yV;
        width=w;
        height=h;
        damage = d;
        range = r;
        speed = s;
        pic = p;
        type = t;
        character = c;
        this.mana = mana;
    }

    public void drawWeapon(Graphics g2d){
        g2d.drawImage(pic.getImage(),x,y,width,height,null);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }
}


