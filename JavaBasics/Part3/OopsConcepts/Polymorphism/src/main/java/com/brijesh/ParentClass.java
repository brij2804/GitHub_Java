package main.java.com.brijesh;

public class ParentClass {

    public ParentClass get() {
        return this;
    }

    public void message() {
        System.out.println("inside parnt class method");
    }

    public String method() {
        String str = "inside the parent class";
        return str;
    }
}
