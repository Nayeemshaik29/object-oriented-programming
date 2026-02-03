package com.java.oop;

public class Main {
    public static void main(String[] args) {
//        Product product1;
//        Product product2;
//        product1 = new Product();
//
//
//        System.out.println("Product ID : " + product1.productId);
//        System.out.println("Product Name : " + product1.productName);
//        System.out.println("Product Price : " + product1.maxRetialPrice);
//        System.out.println("Product Quantity : " + product1.quantity);
//        System.out.println("Product StateTax : " + product1.stateTax);
//        System.out.println("Product CentralTax : " + product1.centralTax);
//        System.out.println("Product Discount : " + product1.discount);
//        System.out.println("Product Stock : "+product1.stock);

//        product2 = new Product( 1115,"MacBook",14000,15,2.7F,2.7F,5,100);
//        System.out.println("Product ID : " + product2.productId);
//        System.out.println("Product Name : " + product2.productName);
//        System.out.println("Product Price : " + product2.maxRetialPrice);
//        System.out.println("Product Quantity : " + product2.quantity);
//        System.out.println("Product StateTax : " + product2.stateTax);
//        System.out.println("Product CentralTax : " + product2.centralTax);
//        System.out.println("Product Discount : " + product2.discount);
//        System.out.println("Product Stock : "+product2.stock);

        Product product3 = new Product(
                1115, "MacBook", 14000, 15, 2.7F, 2.7F, 5, 100
        );

        System.out.format(
                "Product ID          : %d%n" +
                        "Product Name        : %s%n" +
                        "Max Retail Price    : %d%n" +
                        "State Tax (%%)      : %.2f%n" +
                        "Central Tax (%%)    : %.2f%n" +
                        "Discount (%%)       : %.2f%n" +
                        "Quantity            : %d%n" +
                        "Stock               : %d%n",
                product3.productId,
                product3.productName,
                product3.maxRetialPrice,
                product3.stateTax,
                product3.centralTax,
                product3.discount,
                product3.quantity,
                product3.stock
        );
        System.out.println("____________________________________________________________________________________");

        System.out.format(
                "%-6s %-15s %-10s %-10s %-12s %-10s %-10s %-10s%n",
                "ID", "Name", "MRP", "STax", "CTax", "Discount", "Qty", "Stock"
        );
        System.out.println("_____________________________________________________________________________________");

        System.out.format(
                "%-6d %-15s %-10d %-10.2f %-12.2f %-10.2f %-10d %-10d%n",
                product3.productId,
                product3.productName,
                product3.maxRetialPrice,
                product3.stateTax,
                product3.centralTax,
                product3.discount,
                product3.quantity,
                product3.stock
        );
        Product product2 = new Product(
                1111, "SurfaceBook", 140780, 15, 2.7F, 2.7F, 50, 100
        );
        System.out.format(
                "%-6d %-15s %-10d %-10.2f %-12.2f %-10.2f %-10d %-10d%n",
                product2.productId,
                product2.productName,
                product2.maxRetialPrice,
                product2.stateTax,
                product2.centralTax,
                product2.discount,
                product2.quantity,
                product2.stock
        );








    }
}
