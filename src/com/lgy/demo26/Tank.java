package com.lgy.demo26;

public class Tank {
    private int x;
    private int y;

    public void moveUp() {
        x--;
    }
    public void moveDown() {
        x++;
    }
    public void moveLeft() {
        y--;
    }
    public void moveRight() {
        y++;
    }

    public Tank(int x,int y) {
        this.x = x;
        this.y = y;
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


}
