import javax.swing.*;
import java.awt.*;


public class Weapons {

    //add a new constructor for spell books

    private int x,y,width,height, damage, range, speed;
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
    public Weapons(int xV, int yV, int w, int h, int d, int r, int s, ImageIcon p, String t, String c){
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
    }

    public void drawWeapon(Graphics g2d){
        g2d.drawImage(pic.getImage(),x,y,width,height,null);
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


