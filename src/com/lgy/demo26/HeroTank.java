package com.lgy.demo26;

import java.util.Vector;

public class HeroTank extends Tank{
    public int speed = 4;

    Shot shot = null;
    Vector<Shot> shots = new Vector<>();

    public HeroTank(int x, int y) {
        super(x, y);
    }

    public void shotEnemy() {
        switch (getDirect()) {
            case 0:
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        shots.add(shot);
        new Thread(shot).start();
    }
}
