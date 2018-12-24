package com.general;

public class EqualityOperatorTest {

	public static void main(String[] args) {
		String str1 = new String ("PRAFUL");
		String str2 = new String ("PRAFUL");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println(str1 == str2); //address comparison
		System.out.println(str1.equals(str2)); //value comparison
		
		dummy d1 = new dummy("PRAFUL");
		dummy d2 = new dummy("PRAFUL");
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		System.out.println(d1 == d2); //address comparison
		System.out.println(d1.dummytest()== d2.dummytest()); //value comparison
		System.out.println(d1.dummytest().equals(d2.dummytest())); //value comparison
		

	}

}
