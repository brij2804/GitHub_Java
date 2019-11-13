package main.java.com.brijesh;

public class RuntimePoly {

    public static void main(String[] args) {
        ParentClass pc = new ChildClass();
        System.out.println(pc.method());
    }
}
