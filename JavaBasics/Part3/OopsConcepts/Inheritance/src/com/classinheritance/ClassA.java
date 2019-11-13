package com.classinheritance;

public class ClassA extends ParentClassA {

    public double x;
    public double y;
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        System.out.println("child x:" + x);
        return x;
    }

    public double getY() {
        System.out.println("child y:" + y);
        return y;
    }

    public double sum() {
        System.out.println("child value of x: " + x);
        System.out.println("child value of y: " + y);
        System.out.println("child sum of x+y: " + (x + y));
        return x + y;
    }
}
