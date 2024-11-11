import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {

    private BufferedImage back;
    private int key, x, y, typingIndex, screenHeight, screenWidth;
    private double time;
    private ArrayList<Characters> charList;
    private ArrayList<Weapons> weaponList;
    private String misha, screen, typing, playerWeapPosition;
    private Characters player;
    private Weapons weapon;
    private boolean sprint;
    private ArrayList <Spells> spells;
    private Queue<Enemy> enemies;
    private Background bg;
    private List<Background> backgrounds;

    public Game() {
        new Thread(this).start();
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        key = -1;
        x = 0;
        y = 0;
        charList = setCharList();
        screen = "start";
        time = System.currentTimeMillis();
        typing = "Hello!";
        weaponList = setWeaponList();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        //this should be a method, maybe
        spells = new ArrayList<Spells>();
        enemies = setEnemies();
        //System.out.println(enemies.size());
        playerWeapPosition = "right";
        //bg = new Background(0,0,screenWidth,screenHeight);
        backgrounds = new ArrayList<>();
        backgrounds.add(new Background(0, 0, screenWidth, screenHeight, new ImageIcon("assets/background.jpeg")));

    }

    public Queue<Enemy> setEnemies(){
        Queue<Enemy> temp = new LinkedList<Enemy>();
        temp.add(new Zombie(100,100));
        temp.add(new Zombie(200,100));
        temp.add(new Zombie(300,100));
        temp.add(new Zombie(400,100));
        return temp;
    }

    public ArrayList<Characters> setCharList() {
        ArrayList<Characters> temp = new ArrayList<Characters>();
        temp.add(new Fighter(100, 100));
        temp.add(new Heavy(100, 100));
        temp.add(new Mage(100, 100));
        temp.add(new Scout(100, 100));
        return temp;
    }

    public ArrayList<Weapons> setWeaponList() {
        ArrayList<Weapons> temp = new ArrayList<Weapons>();
        temp.add(new LongSword(100, 100));
        temp.add(new KatanaSword(100, 100));
        temp.add(new GildedHammer(100, 100));
        temp.add(new ArchaicHammer(100, 100));
        temp.add(new FireSpellBook(100, 100));
        temp.add(new IceSpellBook(100, 100));
        temp.add(new MetalBat(100, 100));
        temp.add(new WoodenBat(100, 100));
        return temp;
    }

//	public void typing(Graphics g2d, String s, int x, int y){
//		g2d.drawString(s.substring(0,typingIndex),x,y);
//		if (typingIndex<s.length()){
//			if (System.currentTimeMillis()-time>150){
//				time = System.currentTimeMillis();
//				typingIndex++;
//			}
//		}
//	}

    public void drawBackground(Graphics g2d){
//        bg.drawBackground(g2d);
        for (Background background : backgrounds) {
            background.drawBackground(g2d);
        }
    }

    public void drawScreens(Graphics g2d) {
        switch (screen) {
            case "start":

                g2d.drawString((Main.misha()).substring(0, typingIndex), 100, 100);
                if (typingIndex < (Main.misha()).length()) {
                    if (System.currentTimeMillis() - time > 150) {
                        time = System.currentTimeMillis();
                        typingIndex++;
                    }
                } else {
                    if (System.currentTimeMillis() - time > 1000) {
                        g2d.drawString("Press space to start", 100, 600);
                    }
                }
                //typing(g2d,"Press Space to Start",100,100);
                //g2d.drawString("Press space to start",100,600);
                break;
            case "selection":
                drawSelectCharacterScreen(g2d);
                break;
            case "weaponSelect":
                drawWeaponSelectScreen(g2d);
                break;
            case "game":
                //g2d.drawString("Game", 100, 100);
                drawGameScreen(g2d);
                player.move(0, 0, screenWidth, screenHeight);
        }
    }

    public Boolean collision(int x1, int y1, int x2, int y2){
        //x1 and y1 are the coordinates of the object
        //x2 and y2 are the coordinates of the background object or picture or enemy
        if (x1 > x2 && x1 < x2 + 50 && y1 > y2 && y1 < y2 + 50){
            return true;
        }
        else
            return false;

        //what if we change the inputs the be the actual thing instead of numbers
        //we need to take into account width and height
    }

    public void drawGameScreen(Graphics g2d) {
        drawBackground(g2d);
        moveBackground();

        //if (!spells.isEmpty()){
        if (player.getType().equals("Mage")) {
            for (int i = 0; i < spells.size(); i++) {
                spells.get(i).drawSpell(g2d);

                double tempX =(spells.get(i).getX() + (spells.get(i).getDx() * spells.get(i).getSpeed()));
                double tempY =(spells.get(i).getY() + (spells.get(i).getDy() * spells.get(i).getSpeed()));
//                System.out.println(tempX + " " + tempY);

                int tempX2 = (int)tempX;
                int tempY2 = (int)tempY;
//                System.out.println(tempX2 + " " + tempY2);

                spells.get(i).setX(tempX2);
                spells.get(i).setY(tempY2);
            }
        }

        if (enemies.peek()!=null) {
            if (enemies.peek().getHealth() <= 0) {
                enemies.remove();
            }
            enemies.peek().drawEnemy(g2d);
            enemiesMove();
            g2d.drawString("Enemy Health: "+(enemies.peek().getHealth()),800,200);
        }


        g2d.drawString("Player Health: "+player.getHealth(),800,275);
        player.setW(100);
        player.setH(100);
        weapon.setWidth(100);
        weapon.setHeight(100);

        weapon.drawWeapon(g2d);
        player.drawChar(g2d);
        setPlayerWeapPosition();
        enemiesAttack();
    }

    public void moveBackground(){
        int charX = player.getX();
        int charY = player.getY();
        int charW = player.getW();
        int charH = player.getH();


    }



    public void drawSelectCharacterScreen(Graphics g2d) {
        g2d.drawString("Select your character", 700, 100);
        for (int i = 0; i < charList.size(); i++) {
            charList.get(i).setW(150);
            charList.get(i).setH(150);
            charList.get(i).setY((i * 200) + 50);
            charList.get(i).drawChar(g2d);
            g2d.drawString(charList.get(i).getType(), 100 + (charList.get(i).getX() + 100), charList.get(i).getY() + (charList.get(i).getH() / 2));
        }

        if (player != null) {
            g2d.drawString("You picked " + player.getType(), 800, 200);
            g2d.drawString("Health: " + player.getHealth(), 800, 250);
            g2d.drawString("Speed: " + player.getSpeed(), 800, 300);
            if (player.getMana() != 0)
                g2d.drawString("Mana: " + player.getMana(), 800, 350);
            //g2d.drawString("Stamina: " + player.getStam(), 800, 350);
            //g2d.drawString("Press enter to continue", 800, 700);
            g2d.drawString("Press esc to go back", 800, 750);
        }
    }

    public void drawWeaponSelectScreen(Graphics g2d) {
        g2d.drawString("Select your weapon", 100, 100);
        for (int i = 0; i < weaponList.size(); i++) {
            if (weaponList.get(i).getCharacter().equals(player.getType())) {
                weaponList.get(i).setWidth(150);
                weaponList.get(i).setHeight(150);
                if (i % 2 == 0)
                    weaponList.get(i).setY(200);
                else
                    weaponList.get(i).setY(400);
                weaponList.get(i).drawWeapon(g2d);
                g2d.drawString((i + 1) + ": " + weaponList.get(i).getType(), 100 + (weaponList.get(i).getX() + 100), weaponList.get(i).getY() + (weaponList.get(i).getHeight() / 2));
            }
        }

        if (weapon != null) {
            g2d.drawString("You picked " + weapon.getType(), 800, 200);
            g2d.drawString("Damage: " + weapon.getDamage(), 800, 250);
            g2d.drawString("Range: " + weapon.getRange(), 800, 300);
            g2d.drawString("Speed: " + weapon.getSpeed(), 800, 350);
            if (weapon.getMana() != 0)
                g2d.drawString("Mana: " + weapon.getMana(), 800, 400);
            //g2d.drawString("Press space to start", 800, 700);
            g2d.drawString("Press esc to go back", 800, 750);
        }
    }

    public void attack(int x1, int y1, int x2, int y2){
        //if(player.getWeapon() instanceof SpellBooks){
        //x1,y1 is weapon
        //x2,y2 is mouse
        if(weapon instanceof SpellBooks){

            double tdx,tdy;
            tdx = (x2 - x1);
            tdy = (y2 - y1);

            double theta = Math.atan2(tdy, tdx);

            double length = Math.sqrt(tdx*tdx + tdy*tdy);
            double velocityX = 0, velocityY = 0;

            if (length != 0){
                velocityX = (double)((tdx/length)*weapon.getSpeed());
                velocityY = (double)((tdy/length)*weapon.getSpeed());

            }

            if (weapon.getType().equals("Fire Spell Book")){
//                spells.add(new FireSpell(weapon.getX(),weapon.getY(), velocityX, velocityY));
                spells.add(new FireSpell(weapon.getX()+(weapon.getWidth()/2),weapon.getY()+(weapon.getHeight()/2), velocityX, velocityY));
                System.out.println("fire");

            }
            else if (weapon.getType().equals("Ice Spell Book")){
                spells.add(new IceSpell(weapon.getX()+(weapon.getWidth()/2),weapon.getY()+(weapon.getHeight()/2), velocityX, velocityY));
//                spells.add(new IceSpell(weapon.getX(),weapon.getY(), velocityX, velocityY));
                System.out.println("ice");

            }

            for (Spells spell : spells){
                if (enemies.peek()!=null){
                    if( spell.getX() + spell.getW() >= enemies.peek().getX() && spell.getX() <= enemies.peek().getX() + enemies.peek().getW() && spell.getY() + spell.getH() >= enemies.peek().getY() && spell.getY() <= enemies.peek().getY() + enemies.peek().getH()){
                        enemies.peek().setHealth(enemies.peek().getHealth()-weapon.getDamage());
                    }
                }
            }

        }


//        else{
//            //add weapon attack
//        }
    }
    public void meleeAttack(){
        //add weapon attack here
//        if (weapon.getX() >= celestialWheatShop.getX() && weapon.getX() <= celestialWheatShop.getX() + celestialWheatShop.getW()) && (weapon.getY() >= celestialWheatShop.getY() && weapon.getY() <= celestialWheatShop.getY() + celestialWheatShop.getH())){
//
//        }
        //if (enemies.peek()==true)
        if (enemies.peek()!=null){
            if( weapon.getX() + weapon.getWidth() >= enemies.peek().getX() && weapon.getX() <= enemies.peek().getX() + enemies.peek().getW() && weapon.getY() + weapon.getHeight() >= enemies.peek().getY() && weapon.getY() <= enemies.peek().getY() + enemies.peek().getH() ||
                    player.getX() + player.getW() >= enemies.peek().getX() && player.getX() <= enemies.peek().getX() + enemies.peek().getW() && player.getY() + player.getH() >= enemies.peek().getY() && player.getY() <= enemies.peek().getY() + enemies.peek().getH()){
                enemies.peek().setHealth(enemies.peek().getHealth()-weapon.getDamage());
            }
        }
    }

    public void enemiesAttack(){
        if (enemies.peek()!=null) {
            if ((player.getX() >= enemies.peek().getX() && player.getX() <= enemies.peek().getX() + enemies.peek().getW() && player.getY() >= enemies.peek().getY() && player.getY() <= enemies.peek().getY() + enemies.peek().getH()) ) {
            //&& ((System.currentTimeMillis() - time / 1000) == 1)
                player.setHealth(player.getHealth() - enemies.peek().getDamage());
            }
        }
    }

    public void enemiesMove(){
        if (enemies.peek()!=null){
            double tdx,tdy;
            tdx = (player.getX() - enemies.peek().getX());
            tdy = (player.getY() - enemies.peek().getY());

            double theta = Math.atan2(tdy, tdx);

            double length = Math.sqrt(tdx*tdx + tdy*tdy);
            double velocityX = 0, velocityY = 0;

            if (length != 0){
                velocityX = (double)((tdx/length)*enemies.peek().getSpeed());
                velocityY = (double)((tdy/length)*enemies.peek().getSpeed());
            }
//
//            enemies.peek().setDoubleX((enemies.peek().getX() + velocityX));
//            enemies.peek().setDoubleY((enemies.peek().getY() + velocityY));

            enemies.peek().setX((enemies.peek().getX() + (velocityX)));
            enemies.peek().setY((enemies.peek().getY() + (velocityY)));
        }
    }

    public void setPlayerWeapPosition(){
        //if (playerWeapPosition!=null) {
            switch (playerWeapPosition) {
                case "up" -> {
                    weapon.setX(player.getX());
                    weapon.setY(player.getY() - player.getH());
                }
                case "down" -> {
                    weapon.setX(player.getX());
                    weapon.setY(player.getY() + player.getH());
                }
                case "left" -> {
                    weapon.setX(player.getX() - player.getW());
                    weapon.setY(player.getY());
                }
                case "right" -> {
                    weapon.setX(player.getX() + player.getW());
                    weapon.setY(player.getY());
                }
            }
        //}
    }



    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(5);
                repaint();
            }
        } catch (Exception e) {
        }
    }

    public void paint(Graphics g) {

        Graphics2D twoDgraph = (Graphics2D) g;
        if (back == null)
            back = (BufferedImage) ((createImage(getWidth(), getHeight())));

        Graphics g2d = back.createGraphics();

        g2d.clearRect(0, 0, getSize().width, getSize().height);

        g2d.setFont(new Font("Broadway", Font.BOLD, 40));
//		g2d.drawString("Hello!" , x, y);

        drawScreens(g2d);


        twoDgraph.drawImage(back, null, 0, 0);


    }


    //DO NOT DELETE
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }


    //DO NOT DELETE
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

        key = e.getKeyCode();
        System.out.println(key);

//        if ((key == 81) && (screen.equals("game"))) {
//            //enemies.remove();
//            attack();
//        }

        if ((key == 32) && (screen.equals("start"))) {
            screen = "selection";
        }

        if ((key == 27) && (screen.equals("weaponSelect"))) {
            screen = "selection";
            weapon = null;
            player = null;
//			typingIndex=0;
        }

//        if ((key == 10) && (screen.equals("selection"))) {
//            screen = "weaponSelect";
//        }
//
//        if ((key == 32) && (screen.equals("weaponSelect"))) {
//            screen = "game";
//        }

        if (key == 16) {
            sprint = true;
        }

        if (key == 87 && (screen.equals("game"))) {
            //-1
            player.setDy(-player.getSpeed());
           // playerWeapPosition = "up";
//            weapon.setX(player.getX());
//            weapon.setY(player.getY()-player.getH());
            //     player.setPic(new ImageIcon("assets/farmer/walkUp.gif"));
            //player.getPic().getImage().flush();
        }
        if (key == 83 && (screen.equals("game"))) {
            player.setDy(player.getSpeed());
            //playerWeapPosition = "down";
//            weapon.setX(player.getX());
//            weapon.setY(player.getY()+player.getH());
            //     player.setPic(new ImageIcon("assets/farmer/walkDown.gif"));
            //player.getPic().getImage().flush();
        }
        if (key == 65 && (screen.equals("game"))) {
            //-1
            player.setDx(-player.getSpeed());
           // playerWeapPosition = "left";
//            weapon.setX(player.getX()-player.getW());
//            weapon.setY(player.getY());
            //     player.setPic(new ImageIcon("assets/farmer/walkLeft.gif"));
            //player.getPic().getImage().flush();
        }
        if (key == 68 && (screen.equals("game"))) {
            player.setDx(player.getSpeed());
            //playerWeapPosition = "right";
//            weapon.setX(player.getX()+player.getW());
//            weapon.setY(player.getY());
            //     player.setPic(new ImageIcon("assets/farmer/walkRight.gif"));
            //player.getPic().getImage().flush();
        }

        //-1
        if ((sprint) && player.getDx() == -1 && (screen.equals("game"))) {
            player.setDx(-2+player.getSpeed()*-1);
        } else if ((sprint) && player.getDx() == 1 && (screen.equals("game"))) {
            player.setDx(2+player.getSpeed());
        } else if ((sprint) && player.getDy() == -1 && (screen.equals("game"))) {
            player.setDy(-2+player.getSpeed()*-1);
        } else if ((sprint) && player.getDy() == 1 && (screen.equals("game"))) {
            player.setDy(2+player.getSpeed());
        }


    }


    //DO NOT DELETE
    @Override
    public void keyReleased(KeyEvent e) {
        key = e.getKeyCode();
        if (key == 87) {
            player.setDy(0);
//            if ((player.getDX() == 0) && (player.getDY() == 0))
//                player.setPic(new ImageIcon("assets/farmer/idleUp.png"));
        }
        else if (key == 83) {
            player.setDy(0);
//            if ((farmer.getDX() == 0) && (farmer.getDY() == 0))
//                farmer.setPic(new ImageIcon("assets/farmer/idleDown.png"));
        }
        if (key == 65) {
            player.setDx(0);
//            if ((farmer.getDX() == 0) && (farmer.getDY() == 0))
//                farmer.setPic(new ImageIcon("assets/farmer/idleLeft.png"));
        }
        else if (key == 68) {
            player.setDx(0);
//            if ((farmer.getDX() == 0) && (farmer.getDY() == 0))
//                farmer.setPic(new ImageIcon("assets/farmer/idleRight.png"));
        }

        if (key == 16) {
            sprint = false;
        }

        if (!(sprint) && player.getDx() == -2) {
            player.setDx(-player.getSpeed());
        } else if (!(sprint) && player.getDx() == 2) {
            player.setDx(player.getSpeed());
        } else if (!(sprint) && player.getDy() == -2) {
            player.setDy(-player.getSpeed());
        } else if (!(sprint) && player.getDy() == 2) {
            player.setDy(player.getSpeed());
        }

    }


    @Override
    public void mouseDragged(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mouseMoved(MouseEvent arg0) {
        // TODO Auto-generated method stub
        x = arg0.getX();
        y = arg0.getY();

        if (screen.equals("game")){
            if (x>player.getX()+player.getW()){
                playerWeapPosition = "right";
            }
            else if (x<player.getX()){
                playerWeapPosition = "left";
            }
            else if (y>player.getY()+player.getH()){
                playerWeapPosition = "down";
            }
            else if (y<player.getY()){
                playerWeapPosition = "up";
            }
        }

        for (Characters characters : charList) {
            if ((screen.equals("selection")) && (characters.getX() + characters.getW() >= x && characters.getX() <= x && characters.getY() + characters.getH() >= y && characters.getY() <= y)) {
                player = characters;
            }
        }

        for (Weapons weapons : weaponList) {
            if ((screen.equals("weaponSelect")) && (weapons.getX() + weapons.getWidth() >= x && weapons.getX() <= x && weapons.getY() + weapons.getHeight() >= y && weapons.getY() <= y)) {
                weapon = weapons;
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        //check screen
        //(m.getButton() == 1)
        for (Characters characters : charList) {
            if ((screen.equals("selection")) && (arg0.getButton() == 1) && (characters.getX() + characters.getW() >= x && characters.getX() <= x && characters.getY() + characters.getH() >= y && characters.getY() <= y)) {
                player = characters;
                screen = "weaponSelect";
            }
        }
        for (Weapons weapons : weaponList) {
            if ((screen.equals("weaponSelect")) && (weapon != null) && (arg0.getButton() == 1) && (weapons.getX() + weapons.getWidth() >= x && weapons.getX() <= x && weapons.getY() + weapons.getHeight() >= y && weapons.getY() <= y)) {
                weapon = weapons;
                screen = "game";
            }
        }

        if ((screen.equals("game")) && (arg0.getButton() == 1)){
            if(weapon instanceof SpellBooks) {
                attack(weapon.getX()+(weapon.getWidth()/2),weapon.getY()+(weapon.getHeight()/2), x, y);
            }
            else {
                meleeAttack();
            }

        }

    }


    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("entered");
    }


    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("exited");
    }


    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub

        System.out.println("you clicked at" + arg0.getY());
        x = arg0.getX();
        y = arg0.getY();

    }


    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }


}