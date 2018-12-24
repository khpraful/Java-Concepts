package com.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		//CCPayment ccPayment = new CCPayment("Praful", "1234", "06/21", "555");
		CCPayment ccPayment = new CCPayment();
		DCPayment dcPayment = new DCPayment("Khandelwal", "5678", "05/23", "444");
		NBPayment nbPayment = new NBPayment("SBI", "praful", "praful");
		shopping.pay(ccPayment);
		shopping.pay(dcPayment);
		shopping.pay(nbPayment);

	}

}
