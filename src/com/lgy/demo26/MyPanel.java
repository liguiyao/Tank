package com.lgy.demo26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener,Runnable {
    HeroTank myTank = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;
    EnemyTank e1 = null;
    EnemyTank e2 = null;
    EnemyTank e3 = null;
    int direct = 0;

    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel(){
        myTank = new HeroTank(100, 100);
        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank((100 * (i + 1)), 0));
            enemyTanks.get(i).setDirect(2);
            new Thread(enemyTanks.get(i)).start();
            Shot shot = new Shot(enemyTanks.get(i).getX() + 20, enemyTanks.get(i).getY() + 60, enemyTanks.get(i).getDirect());
            enemyTanks.get(i).shots.add(shot);
            new Thread(shot).start();
        }
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bb.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (myTank.isLive && myTank != null) {
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        }
//        if (myTank.shot != null && myTank.shot.isLive) {
//            g.draw3DRect(myTank.shot.x,myTank.shot.y,2,2,false);
//        }
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 2, 2, false);
            } else {
                myTank.shots.remove(shot);
            }
        }
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life > 0) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, null);
            }
            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
        for (EnemyTank enemyTank : enemyTanks) {
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                for (int i = 0; i < enemyTank.shots.size(); i++) {
                    Shot shot = enemyTank.shots.get(i);
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
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
            myTank.setDirect(0);
            if (myTank.getY() > 0) {
                myTank.setY(myTank.getY()- myTank.speed);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirect(2);
            if (myTank.getY() + 60 < 750) {
                myTank.setY(myTank.getY() + myTank.speed);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(3);
            if (myTank.getX() > 0) {
                myTank.setX(myTank.getX() - myTank.speed);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(1);
            if (myTank.getX() +60 < 1000) {
                myTank.setX(myTank.getX() + myTank.speed);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
//            发射一颗子弹
//            if (myTank.shot == null || !myTank.shot.isLive) {
//                myTank.shotEnemy();
//            }
            myTank.shotEnemy();

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void hitTanks() {
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot!=null && shot.isLive) {
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTanks(shot, enemyTank);
                }

            }
        }

    }

    public void hitHero() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (myTank.isLive && shot.isLive) {
                    hitTanks(shot, myTank);
                }
            }
        }
    }


    public void hitTanks(Shot s,Tank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (myTank.shot!=null && myTank.shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTanks(myTank.shot, enemyTank);
                }

            }
            hitTanks();
            hitHero();
            repaint();
        }
    }
}
