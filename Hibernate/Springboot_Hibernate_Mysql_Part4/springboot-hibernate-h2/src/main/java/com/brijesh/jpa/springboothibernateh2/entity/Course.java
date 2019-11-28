package com.brijesh.jpa.springboothibernateh2.entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "fullname", nullable = false)
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
