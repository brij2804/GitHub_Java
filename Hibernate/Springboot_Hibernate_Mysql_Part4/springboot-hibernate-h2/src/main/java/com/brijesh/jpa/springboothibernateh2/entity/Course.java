package com.brijesh.jpa.springboothibernateh2.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "course")

@NamedQueries(value={
        @NamedQuery(name="query_get_all_courses",
                query="select c from Course c"),
        @NamedQuery(name="query_get_brijesh_courses",
                query="select c from Course c where fullname like 'Brijesh%'"),
})
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "fullname", nullable = false)
    private String name;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

    @CreationTimestamp
    private LocalDateTime createdDate;

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
