package com.java.oop;

class Payment {
    private String paymentStatus; // INITIATED, SUCCESS, FAILED, REFUNDED


    public Payment() {
        this.paymentStatus = "INITIATED";
    }



    boolean initiatePayment(Order order) {
        if (order == null) {
            return false;
        }
        paymentStatus = "INITIATED";
        return true;
    }



    boolean isPaymentAmountValid(double amount, Order order) {
        return amount == order.calculateTotalAmount();
    }



    boolean processPayment(String paymentMode, Order order) {
        if (paymentMode == null || order == null) {
            paymentStatus = "FAILED";
            return false;
        }
        paymentStatus = "SUCCESS";
        order.markAsPaid();
        return true;
    }



    boolean refundPayment(Order order) {
        if (!order.getStatus().equals("CANCELLED")) {
            return false;
        }
        paymentStatus = "REFUNDED";
        return true;
    }



    String getPaymentStatus() {
        return paymentStatus;
    }
}