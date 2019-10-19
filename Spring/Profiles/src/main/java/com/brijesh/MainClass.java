package com.brijesh;

import com.brijesh.configuration.DBConfiguration;

public class MainClass {
    public static void main(String[] args){
        DBConfiguration dbconfig = new DBConfiguration();
        dbconfig.DatabaseConnection();
    }
}
