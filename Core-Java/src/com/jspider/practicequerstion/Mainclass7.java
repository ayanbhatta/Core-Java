package com.jspider.practicequerstion;

public class Mainclass7 {
	    public static void main(String[] args) {
	        MobileRecharge plan1 = new MobileRecharge(100.0);
	        plan1.displayFinalDetails();
	        MobileRecharge plan2 = new MobileRecharge(500.0, 50.0);
	        plan2.displayFinalDetails();
	        MobileRecharge plan3 = new MobileRecharge(799.0, 100.0, 28);
	        plan3.displayFinalDetails();
	    }
}
