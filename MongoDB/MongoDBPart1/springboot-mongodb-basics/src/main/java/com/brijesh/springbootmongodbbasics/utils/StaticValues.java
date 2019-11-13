package com.brijesh.springbootmongodbbasics.utils;

import java.math.BigInteger;

public class StaticValues {

    public static Integer idCounter = 1;

    public static Integer getIdCounter() {
        return idCounter++;
    }

    public static void setIdCounter() {
        idCounter = 0;
    }
}
