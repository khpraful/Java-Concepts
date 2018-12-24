package com.strategy;

public class Shopping {
public void pay(Payment paymentType){
	double amount = 20;
	paymentType.makepayment(amount);
}
}
