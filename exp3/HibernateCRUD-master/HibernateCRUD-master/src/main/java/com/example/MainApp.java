package com.example;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // Insert multiple sample products (8 products)
        dao.insert(new Product("Laptop", "HP Pavilion", 60000, 10));
        dao.insert(new Product("Keyboard", "Mechanical Keyboard", 1500, 15));
        dao.insert(new Product("Monitor", "Full HD Monitor", 7000, 7));
        dao.insert(new Product("USB Cable", "Type-C Cable", 200, 50));
        dao.insert(new Product("Headphones", "Bass Boosted Headphones", 1200, 10));
        dao.insert(new Product("Webcam", "1080p Webcam", 2500, 8));
        dao.insert(new Product("Mouse", "Wireless Mouse", 400, 25));
        dao.insert(new Product("Speaker", "Bluetooth Speaker", 1800, 12));

        System.out.println("==== 8 Product Records Inserted Successfully ====");
    }
}
