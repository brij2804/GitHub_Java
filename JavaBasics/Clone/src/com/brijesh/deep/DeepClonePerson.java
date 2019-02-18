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

    protected Object clone() throws CloneNotSupportedException{
      DeepClonePerson deepClonePerson= (DeepClonePerson) super.clone();
      deepClonePerson.name = (Name) name.clone();
      deepClonePerson.address = (Address) address.clone();
      return deepClonePerson;
    }
}
