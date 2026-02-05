package com.java.oop;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address(
                "12A",
                "MG Road",
                "Hyderabad",
                "50033401"
        );

        Customer customer = new Customer(
                101,
                "Nayeem",
                address1,
                "98765420"
        );

        System.out.println("----- CUSTOMER DETAILS -----");
        customer.printCustomerDetails();

        Address newAddress = new Address(
                "45B",
                "Brigade Road",
                "Bangalore",
                "56005641"
        );

        customer.updateCustomerAddress(newAddress);
        customer.deactivateAccount();

        System.out.println("\nAfter updates:");
        customer.printCustomerDetails();
    }
}
