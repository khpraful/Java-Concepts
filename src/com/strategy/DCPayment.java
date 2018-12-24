package com.strategy;

public class DCPayment implements Payment {

	private String CardHolderName;
	private String DebitCardNumber;
	private String ExpiryDate;
	private String CVV;
	
	
	public DCPayment(String cardHolderName, String debitCardNumber,
			String expiryDate, String cVV) {
		super();
		CardHolderName = cardHolderName;
		DebitCardNumber = debitCardNumber;
		ExpiryDate = expiryDate;
		CVV = cVV;
	}


	public void makepayment(double amount) {
		System.out.println("Amount paid by Debit Card: " + amount);

	}

}
