package com.classinheritance;

public class ClassA extends ParentClassA {

    public double x;
    public double y;
    private String name;

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double sum(){
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);
        System.out.println("sum of x+y: "+(x+y));
        return x+y;
    }
}
