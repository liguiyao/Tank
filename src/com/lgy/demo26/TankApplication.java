package com.lgy.demo26;

import javax.swing.*;

public class TankApplication extends JFrame {
    MyPanel mp =  null;
    public static void main(String[] args) {
        new TankApplication();
    }

    public TankApplication() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
