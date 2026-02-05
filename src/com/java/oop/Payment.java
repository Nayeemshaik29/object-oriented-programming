package com.java.oop;

class Payment {

    private PaymentStatus paymentStatus;
    private PaymentType paymentType;

    public Payment() {
        this.paymentStatus = PaymentStatus.INITIATED;
    }

    boolean initiatePayment(Order order) {
        if (order == null) {
            paymentStatus = PaymentStatus.FAILED;
            return false;
        }
        paymentStatus = PaymentStatus.INITIATED;
        return true;
    }

    boolean isPaymentAmountValid(double amount, Order order) {
        if (order == null) return false;

        // safer double comparison
        return Math.abs(amount - order.calculateTotalAmount()) < 0.001;
    }

    boolean processPayment(PaymentType paymentType, Order order) {
        if (paymentType == null || order == null) {
            paymentStatus = PaymentStatus.FAILED;
            return false;
        }

        this.paymentType = paymentType;
        paymentStatus = PaymentStatus.SUCCESS;
        order.markAsPaid();
        return true;
    }

    boolean refundPayment(Order order) {
        if (order == null ||
                paymentStatus != PaymentStatus.SUCCESS ||
                !order.getStatus().equals("CANCELLED")) {
            return false;
        }

        paymentStatus = PaymentStatus.REFUNDED;
        return true;
    }

    PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
