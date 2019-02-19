package com.brijesh.deep;

import com.brijesh.Address;
import com.brijesh.Name;

public class DeepClonePerson implements Cloneable{

    private Name name;
    private Address address;

    public DeepClonePerson(Name name,Address address){
      this.name=name;
      this.address=address;
    }

    public Object clone() throws CloneNotSupportedException{
      DeepClonePerson deepClonePerson= (DeepClonePerson) super.clone();
      deepClonePerson.name = (Name) name.clone();
      deepClonePerson.address = (Address) address.clone();
      return deepClonePerson;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
