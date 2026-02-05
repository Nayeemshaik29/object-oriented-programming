package com.java.oop;

public class Address {
    private String houseNo;
    private String street;
    private String city;
    private String pincode;

    public Address(String houseNo, String street, String city, String pincode) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public void updateAddress(String houseNo, String street, String city, String pincode) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public void printAddress() {
        System.out.println(houseNo + ", " + street + ", " + city + " - " + pincode);
    }
}
