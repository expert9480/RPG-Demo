import javax.swing.*;


public class Weapons {

    private int x,y,width,height, damage, range, speed;
    private String type;
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

    }
    public Weapons(int xV, int yV, int w, int h, int d, int r, int s, ImageIcon p, String t){
        x=xV;
        y=yV;
        width=w;
        height=h;
        damage = d;
        range = r;
        speed = s;
        pic = p;
        type = t;
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


