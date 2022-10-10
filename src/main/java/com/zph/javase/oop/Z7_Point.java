package com.zph.javase.oop;

public class Z7_Point {
    int x;
    int y;

    //设置二维的坐标点
    public void set(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public double calcDistance(Z7_Point p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }

    public void changePoint(Z7_Point p) {
        int a = p.x;
        p.x = x;
        x = a;
        int b = p.y;
        p.y = y;
        y = b;
    }

    public void show() {
        System.out.println("[" + x + "," + y + "]");
    }

    public static void main(String[] args) {

        Z7_Point p1 = new Z7_Point();
        p1.set(3, 5);
        Z7_Point p2 = new Z7_Point();
        p2.set(2, 4);
        System.out.println(p1.calcDistance(p2));
        p1.changePoint(p2);
        p1.show();
        p2.show();

    }
}
