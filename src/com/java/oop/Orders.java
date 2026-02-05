package com.java.oop;

class Order {
    private int orderId;
    private double totalAmount;
    private String status; // PLACED, SHIPPED, DELIVERED, CANCELLED
    private boolean paid;


    public Order(int orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.status = "PLACED";
        this.paid = false;
    }



    double calculateTotalAmount() {
        return totalAmount;
    }



    void updateOrderStatus(String status) {
        this.status = status;
    }



    boolean isPaid() {
        return paid;
    }



    void markAsPaid() {
        paid = true;
    }



    boolean cancelOrder() {
        if (status.equals("DELIVERED")) {
            return false;
        }
        status = "CANCELLED";
        return true;
    }



    void printOrderSummary() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + totalAmount);
        System.out.println("Status: " + status);
        System.out.println("Paid: " + paid);
    }


    String getStatus() {
        return status;
    }
}