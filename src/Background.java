import javax.swing.*;
import java.awt.*;

public class Background {
    int x,y,w,h,dx,dy,id;
    ImageIcon pic;

    public Background(){
        x=0;
        y=0;
        w=0;
        h=0;
        dx=0;
        dy=0;
        pic = new ImageIcon("assets/background.png");
        id =0;
    }

    public Background(int xV, int yV, int width, int height, ImageIcon p){
        x=xV;
        y=yV;
        w=width;
        h=height;
        pic=p;
    }

    public Background(int xV, int yV, int width, int height){
        x=xV;
        y=yV;
        w=width;
        h=height;
        pic = new ImageIcon("assets/background.jpeg");
    }

    public void drawBackground(Graphics g2d){
        g2d.drawImage(pic.getImage(),x,y,w,h,null);
    }

    public void setImagePath(String path) {
        this.pic = new ImageIcon(path);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
