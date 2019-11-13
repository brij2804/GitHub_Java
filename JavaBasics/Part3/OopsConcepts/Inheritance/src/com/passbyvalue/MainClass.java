package com.passbyvalue;

public class MainClass {

    public static void swap(Point args1, Point args2) {
        args1.x = 100;
        args1.y = 100;
        Point temp = args1;
        args1 = args2;
        args2 = temp;
    }

    public static void main(String[] args) {
        Point pnt1 = new Point(0, 0);
        Point pnt2 = new Point(0, 0);
        System.out.println("X: " + pnt1.x + "Y: " + pnt1.y);
        System.out.println("X: " + pnt2.x + "Y: " + pnt2.y);
        System.out.println(" ");
        swap(pnt1, pnt2);
        System.out.println("X: " + pnt1.x + "Y: " + pnt1.y);
        System.out.println("X: " + pnt2.x + "Y: " + pnt2.y);
    }
}
