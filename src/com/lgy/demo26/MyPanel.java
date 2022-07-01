package com.lgy.demo26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    HeroTank myTank = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    EnemyTank e1 = null;
    EnemyTank e2 = null;
    EnemyTank e3 = null;
    int direct = 0;

    public MyPanel(){
        myTank = new HeroTank(100, 100);
        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank((100 * (i + 1)), 0));
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTank(myTank.getX(), myTank.getY(), g, myTank.direct, 0);
        for (EnemyTank enemyTank : enemyTanks) {
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.direct, 1);
        }
    }

    public void drawTank(int x,int y,Graphics g,int direct,int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0://上
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x + 9, y + 20, 20, 20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            case 1://右
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x + 20, y + 9, 20, 20);
                g.drawLine(x+20,y+20,x+60,y+20);
                break;
            case 2://下
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x + 9, y + 20, 20, 20);
                g.drawLine(x+20,y+20,x+20,y+60);
                break;
            case 3://左
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x + 20, y + 9, 20, 20);
                g.drawLine(x,y+20,x+20,y+20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {
            direct = 0;
            myTank.setY(myTank.getY()- myTank.speed);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            direct = 2;
            myTank.setY(myTank.getY() + myTank.speed);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            direct = 3;
            myTank.setX(myTank.getX() - myTank.speed);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            direct = 1;
            myTank.setX(myTank.getX() + myTank.speed);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
