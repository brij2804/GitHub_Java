package main.java.com.brijesh;

public class MainClass {

    public static void main(String[] args){
        Intermediate inm= new Intermediate();
        inm.map();
        inm.filter();
        inm.sorted();

        Terminal ter = new Terminal();
        ter.foreach();
    }
}
