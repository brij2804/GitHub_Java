package com.brijesh.model.request;

public class StudentRequest {

    private String firstName;
    private String lastName;
    private Integer rollNumber;
    private Integer age;
    private AddressRequest addressRequest;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }
}
