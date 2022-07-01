package com.lgy.demo24;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawOval(10, 10, 100, 100);
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,100,150);
//        g.fillRect(10,10,100,100);
//        g.drawString("hello",10,10);
//        g.setColor(Color.cyan);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/fruit.png"));
//        g.drawImage(image, 10, 10, 100, 100, this);
        g.setColor(Color.cyan);
//        g.fill3DRect(10,10,20,60,);


    }

}

class DrawCircle extends JFrame{
    private MyPanel mp;
    public static void main(String[] args) {
        new DrawCircle();

    }

    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
