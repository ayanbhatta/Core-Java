package com.jspider.practicequerstion;

public class Mainclass2 {
    public static void main(String[] args) {
        AmazonPrime user = new AmazonPrime();
        user.subscription();
        user.subscription(999.00);
        user.subscription(1499.00, 12);
    }
}
