package com.brijesh.sampleone;

public class SampleOneClass {

    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable dr = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        dr.draw();

    }

}
