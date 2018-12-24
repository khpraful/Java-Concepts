package com.serialization;

import java.io.Serializable;

public class BankAddress implements Serializable{
	String addressline1;
	String addressline2;
	String zipcode;
	public BankAddress(String addressline1, String addressline2, String zipcode) {
		super();
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.zipcode = zipcode;
	}
	
	
}
