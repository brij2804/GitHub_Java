package com.brijesh.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employee",schema = "hibernate_testdb1")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public Employee(){
        super();
    }

    public Employee(final String name){
        super();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result+((name == null)?0:name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!= obj.getClass())
            return false;
        final Employee other = (Employee) obj;
        if(name==null) {
            if (other.name != null)
                return false;
        }else if(!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString(){
        final StringBuilder builder= new StringBuilder();
        builder.append("Employee [name=").append(name).append("]");
        return builder.toString();
    }
}
