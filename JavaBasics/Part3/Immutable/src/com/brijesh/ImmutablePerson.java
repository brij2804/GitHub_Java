package com.brijesh;

public final class ImmutablePerson {

    private final String firstName;
    private final String lastName;

    public ImmutablePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
