package com.strategy;

public class CCPayment implements Payment{

	/*private String CardHolderName;
	private String CreditCardNumber;
	private String ExpiryDate;
	private String CVV;
	
	
	
	public CCPayment(String cardHolderName, String creditCardNumber,
			String expiryDate, String cVV) {
		super();
		CardHolderName = cardHolderName;
		CreditCardNumber = creditCardNumber;
		ExpiryDate = expiryDate;
		CVV = cVV;
	}*/
	
	public CCPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void makepayment(double amount) {
		System.out.println("Amount paid by Credit Card: " + amount);
		
	}

	

}
