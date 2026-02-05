package com.java.oop;

class Customer {
    private int customerId;
    private String name;
    private String address;
    private String contactNumber;
    private boolean active;


    public Customer(int customerId, String name, String address, String contactNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.active = true;
    }



    void printCustomerDetails() {
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Active: " + active);
    }



    boolean updateAddress(String newAddress) {
        if (newAddress == null || newAddress.isEmpty()) {
            return false;
        }
        this.address = newAddress;
        return true;
    }



    boolean isActive() {
        return active;
    }



    void deactivateAccount() {
        active = false;
    }



    boolean isContactNumberValid() {
        return contactNumber != null && contactNumber.length() == 10;
    }
}