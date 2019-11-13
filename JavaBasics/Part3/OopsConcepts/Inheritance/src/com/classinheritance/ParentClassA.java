package com.classinheritance;

public class ParentClassA {

    public String name;
    public double x;
    public double y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        System.out.println("parent x:" + x);
        return x;
    }

    public double getY() {
        System.out.println("parent y:" + y);
        return y;
    }

    public double sum() {
        System.out.println("parent value of x: " + x);
        System.out.println("parent value of y: " + y);
        System.out.println("parent sum of x+y: " + (x + y));
        return x + y;
    }

}
