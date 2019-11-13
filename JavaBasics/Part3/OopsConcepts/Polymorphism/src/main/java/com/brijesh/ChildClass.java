package main.java.com.brijesh;

public class ChildClass extends ParentClass {

    public ChildClass get() {
        return this;
    }

    public void message() {
        System.out.println("inside child class method");
    }

    public String method() {
        String str = "inside the child class";
        return str;
    }
}
