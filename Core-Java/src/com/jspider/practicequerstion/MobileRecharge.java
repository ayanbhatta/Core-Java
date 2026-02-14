package com.jspider.practicequerstion;

public class MobileRecharge {
    double amount;
    double cashback;
    int extraValidity;

    public MobileRecharge(double amount) {
        this.amount = amount;
        this.cashback = 0.0;
        this.extraValidity = 0;
        System.out.println("Basic Recharge Successful: ₹" + amount);
    }
    public MobileRecharge(double amount, double cashback) {
        this.amount = amount;
        this.cashback = cashback;
        this.extraValidity = 0;
        System.out.println("Cashback Recharge Successful: ₹" + amount + " | Cashback: ₹" + cashback);
    }
    public MobileRecharge(double amount, double cashback, int extraValidity) {
        this.amount = amount;
        this.cashback = cashback;
        this.extraValidity = extraValidity;
        System.out.println("Combo Recharge Successful: ₹" + amount + 
                           " | Cashback: ₹" + cashback + 
                           " | Extra Validity: " + extraValidity + " days");
    }
    public void displayFinalDetails() {
        double netCost = amount - cashback;
        System.out.println("Final Bill Summary: Net Cost: ₹" + netCost + ", Bonus Validity: " + extraValidity + " days.");
    }
}
