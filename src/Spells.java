import javax.swing.*;
import java.awt.*;

public class Spells {
    private int x,y,w,h,speed,cost;
    private ImageIcon pic;
    private String type;

    public Spells(){
        x=0;
        y=0;
        w=0;
        h=0;
        speed=0;
        cost=0;
        pic = new ImageIcon();
        type = "";
    }

    public Spells(int xV, int yV, int width, int height, int sp, int c, ImageIcon p, String t){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        cost=c;
        pic=p;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void drawSpell(Graphics g2d){
        g2d.drawImage(pic.getImage(),x,y,w,h,null);
    }
}
