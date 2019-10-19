package com.brijesh.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class DBConfiguration {

    private String driveClassName;

    private String url;

    private String username;

    private String password;

    public String getDriveClassName() {
        return driveClassName;
    }

    public void setDriveClassName(String driveClassName) {
        this.driveClassName = driveClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ConfigurationProperties(prefix ="spring.datasource")
    @Bean
    public void DatabaseConnection(){
        System.out.println("driver class name :"+driveClassName);
        System.out.println("url :"+ url);
        System.out.println("username :"+username);
        System.out.println("password :"+password);
    }
}
