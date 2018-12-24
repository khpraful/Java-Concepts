package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestBank {

	public static void main(String[] args) throws Exception {
		
		Bank b = new Bank();
		b.bankname = "Bank of America";
		b.rateofinterest = 2.3;
		b.address = new BankAddress("24 Sterling Drive", "Stradford Street", "UBX 123");
		
				
		File f = new File("bank.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		oos.close();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bank b1 = (Bank)ois.readObject();
		ois.close();
		BankAddress add = (BankAddress) b1.address;
		
		System.out.println("Object values are read as follows:");
		System.out.println("Bank name: "+ b1.bankname);
		System.out.println("Rate of Interest: "+ b1.rateofinterest);
		System.out.println("Address: "+ add.addressline1 + "," + add.addressline2 + "," +add.zipcode);

	}

}
