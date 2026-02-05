package com.java.oop;

public class Main {
    public static void main(String[] args) {

        // ================= CUSTOMER =================
        Customer customer = new Customer(
                101,
                "Nayeem",
                "Hyderabad",
                "9876543210"
        );

        System.out.println("----- CUSTOMER DETAILS -----");
        customer.printCustomerDetails();

        System.out.println("Is customer active? " + customer.isActive());
        System.out.println("Is contact valid? " + customer.isContactNumberValid());

        customer.updateAddress("Bangalore");
        customer.deactivateAccount();

        System.out.println("\nAfter updates:");
        customer.printCustomerDetails();


        // ================= ORDER =================
        Order order = new Order(5001, 45000);

        System.out.println("\n----- ORDER DETAILS -----");
        order.printOrderSummary();

        System.out.println("Total Amount: " + order.calculateTotalAmount());
        System.out.println("Is order paid? " + order.isPaid());

        order.updateOrderStatus("SHIPPED");
        order.printOrderSummary();


        // ================= PAYMENT =================
        Payment payment = new Payment();

        System.out.println("\n----- PAYMENT DETAILS -----");
        payment.initiatePayment(order);

        boolean validAmount = payment.isPaymentAmountValid(45000, order);
        System.out.println("Is payment amount valid? " + validAmount);

        payment.processPayment("UPI", order);

        System.out.println("Payment Status: " + payment.getPaymentStatus());
        System.out.println("Is order paid now? " + order.isPaid());


        // ================= CANCEL & REFUND =================
        order.cancelOrder();
        payment.refundPayment(order);

        System.out.println("\nAfter cancellation:");
        order.printOrderSummary();
        System.out.println("Payment Status: " + payment.getPaymentStatus());
    }
}
