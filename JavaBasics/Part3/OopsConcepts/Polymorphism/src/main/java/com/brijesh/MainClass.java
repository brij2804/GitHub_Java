package main.java.com.brijesh;

public class MainClass {

    public static void main(String[] args) {
        // method overloading
        CompiletimePoly cp = new CompiletimePoly();
        cp.method(1);
        cp.method(2, 3);

        // covariant return type method in overriding
        ChildClass cc = new ChildClass();
        cc.get().message();
    }
}
