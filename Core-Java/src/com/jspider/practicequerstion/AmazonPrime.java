package com.jspider.practicequerstion;


public class AmazonPrime {

    public void subscription() {
        System.out.println("FREE");
        System.out.println("Standard delivery, limited video access.");
        System.out.println("Cost: ₹0");
        System.out.println("---------------------------");
    }

    public void subscription(double price) {
        System.out.println("GOLD");
        System.out.println("Fast delivery, Prime Video, Prime Music.");
        System.out.println("Cost: ₹" + price);
        System.out.println("---------------------------");
    }

    public void subscription(double price, int months) {
        System.out.println("PREMIUM");
        System.out.println("One-day delivery, 4K Video, Ad-free Music.");
        System.out.println("Duration: " + months + " months");
        System.out.println("Total Cost: ₹" + price);
        System.out.println("---------------------------");
    }
}
