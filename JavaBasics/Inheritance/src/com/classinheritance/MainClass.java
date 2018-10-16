package com.classinheritance;

public class MainClass {

    public static void method1(){
        ParentClassA parentClassA = new ClassA();
        parentClassA.x= 10;
        parentClassA.y = 11;
        System.out.println(parentClassA.getX());
        System.out.println(parentClassA.getY());
        System.out.println(parentClassA.sum());
    }

    public static void method2(){
        ClassA classA = new ClassA();
        classA.x= 10;
        classA.y = 11;
        System.out.println(classA.getX());
        System.out.println(classA.getY());
        System.out.println(classA.sum());
    }

    public static void method3(){
        ParentClassA parentClassA = new ParentClassA();
        parentClassA.x= 10;
        parentClassA.y = 11;
        System.out.println(parentClassA.getX());
        System.out.println(parentClassA.getY());
        System.out.println(parentClassA.sum());
    }

    public static void main(String[] args){
        method1();
        method2();
        method3();
    }


}
