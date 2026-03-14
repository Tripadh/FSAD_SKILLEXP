package com.example;

import org.hibernate.Session;

public class ProductHQLDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();

        System.out.println("\n---- Sort by price ASC ----");
        session.createQuery("FROM Product ORDER BY price ASC", Product.class)
                .list().forEach(System.out::println);

        System.out.println("\n---- Sort by quantity DESC ----");
        session.createQuery("FROM Product ORDER BY quantity DESC", Product.class)
                .list().forEach(System.out::println);

        System.out.println("\n---- First 3 products ----");
        session.createQuery("FROM Product", Product.class)
                .setFirstResult(0)
                .setMaxResults(3)
                .list().forEach(System.out::println);

        System.out.println("\n---- Count of products ----");
        Long count = (Long) session.createQuery(
                "SELECT COUNT(*) FROM Product").uniqueResult();
        System.out.println("Total Products: " + count);

        System.out.println("\n---- Max price ----");
        Double maxPrice = (Double) session.createQuery(
                "SELECT MAX(price) FROM Product").uniqueResult();
        System.out.println("Max Price: " + maxPrice);

        System.out.println("\n---- Min price ----");
        Double minPrice = (Double) session.createQuery(
                "SELECT MIN(price) FROM Product").uniqueResult();
        System.out.println("Min Price: " + minPrice);

        System.out.println("\n---- Products price 1000 - 5000 ----");
        session.createQuery("FROM Product WHERE price BETWEEN 1000 AND 5000",
                Product.class)
                .list().forEach(System.out::println);

        System.out.println("\n---- LIKE 'M%' ----");
        session.createQuery("FROM Product WHERE name LIKE 'M%'",
                Product.class)
                .list().forEach(System.out::println);

        session.close();
    }
}
