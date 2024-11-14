import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Chests {
    private int x,y,w,h,cost;
    private String type;
    private ImageIcon pic,openPic;
    private boolean open;
    //private ArrayList

    public Chests(){
        x=0;
        y=0;
        w=0;
        h=0;
        cost=0;
        pic = new ImageIcon();
        type = "";
        open = false;
        openPic = new ImageIcon();
    }

    public Chests(int xV, int yV, int width, int height, int c, ImageIcon p, String t, ImageIcon o){
        x=xV;
        y=yV;
        w=width;
        h=height;
        cost=c;
        pic=p;
        type=t;
        open = false;
        openPic = o;
    }

    public void drawClosedChest(Graphics g2d){
        g2d.drawImage(pic.getImage(),x,y,w,h,null);
    }

    public void drawOpenChest(Graphics g2d){
        g2d.drawImage(openPic.getImage(),x,y,w,h,null);
    }

    public ImageIcon getOpenPic() {
        return openPic;
    }

    public void setOpenPic(ImageIcon openPic) {
        this.openPic = openPic;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
