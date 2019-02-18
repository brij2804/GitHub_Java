package com.brijesh.shallow;

import com.brijesh.Address;
import com.brijesh.Name;

public class ShallowClonePerson implements Cloneable{

    private Name name;
    private Address address;

    public ShallowClonePerson(Name name,Address address){
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException{
       return super.clone();
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
