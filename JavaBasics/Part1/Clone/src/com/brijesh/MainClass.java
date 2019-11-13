package com.brijesh;

import com.brijesh.deep.DeepClonePerson;

public class MainClass {

    public static void main(String[] args) {

        Name name1 = new Name("John", "Morris", null);
        Address add1 = new Address("gokulam apartment", "bangalore", "560062");

        DeepClonePerson deepClonePerson = new DeepClonePerson(name1, add1);

        DeepClonePerson deepClonePerson1 = null;
        try {
            deepClonePerson1 = (DeepClonePerson) deepClonePerson.clone();


        System.out.println(deepClonePerson.getName().getFirstName());

        //changing the value of second object
        Name name2= new Name("Marco","rubio",null);
        deepClonePerson1.setName(name2);

        System.out.println(deepClonePerson.getName().getFirstName());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
