package main.java.com.brijesh;

// Method overloading is compile time polymorphism
public class CompiletimePoly {


    public int method(int num1) {
        System.out.println("the num1 is :" + num1);
        return num1;
    }

    public int method(int num1, int num2) {
        System.out.println("the numbers are " + num1 + num2);
        return num1 + num2;
    }
}
