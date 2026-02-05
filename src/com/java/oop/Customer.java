package com.java.oop;

class Customer {
    private int customerId;
    private String name;
    private Address address;
    private String contactNumber;
    private boolean active;

    public Customer(int customerId, String name, Address address, String contactNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.active = true;
    }

    void printCustomerDetails() {
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.printAddress();
        System.out.println("Contact: " + contactNumber);
        System.out.println("Active: " + active);
    }

    boolean updateCustomerAddress(Address newAddress) {
        if (newAddress == null) {
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
        return contactNumber != null && contactNumber.matches("\\d{10}");
    }
}
