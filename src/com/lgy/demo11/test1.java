package com.lgy.demo11;

public class test1 {
    public static void main(String[] args) {
        Color black = Color.BLACK;
        black.show();

        switch (black) {
            case RED:
                System.out.println("红");
                break;
            case BLACK:
                System.out.println("黑");
                break;
            case GREEN:
                System.out.println("绿");
                break;
            case YELLOW:
                System.out.println("");
                break;
        }
    }
}
enum Color implements ColorService{
    RED(255,0,0),
    GREEN(0,255,0),
    BLACK(255,255,255),
    YELLOW(255, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("RGB : "+redValue+" "+greenValue+" "+blueValue);
    }
}


