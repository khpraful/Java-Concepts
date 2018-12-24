package com.strategy;

public class NBPayment implements Payment {

	private String BankName;
	private String UserName;
	private String Password;
	
	
	public NBPayment(String bankName, String userName, String password) {
		super();
		BankName = bankName;
		UserName = userName;
		Password = password;
	}


	public void makepayment(double amount) {
		System.out.println("Amount paid by Net Banking: " + amount);
		
	}

}
