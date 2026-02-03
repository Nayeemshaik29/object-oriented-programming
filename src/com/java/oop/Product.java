package com.java.oop;

public class Product {
    int productId;
    String productName;
    int maxRetialPrice;
    float stateTax;
    float centralTax;
    float discount;
    int quantity;
    long stock;
    public Product() {
        System.out.println("Product Constructor... Has initialized");
    }
    public Product(int productId, String productName,int maxRetialPrice, float stateTax, float centralTax, float discount, int quantity, long stock) {
        this.productId = productId;
        this.productName = productName;
        this.maxRetialPrice = maxRetialPrice;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.discount = discount;
        this.quantity = quantity;
        this.stock = stock;


    }


}
