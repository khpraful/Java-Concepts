package com.general;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "PRAFUL";
		String str2 = new String ("PRAFUL");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		str2 = "PRAFUL";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println("==============");
		String str3 = "PRAFUL";
		String str4 = "PRAFUL"; //returns existing object from string pool so no address change
		String str5 = new String("PRAFUL");
		String str6 = new String("PRAFUL"); //creates new object so address change
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str3 == str4);
		System.out.println(str5 == str6);
		StringBuffer sb = new StringBuffer();
		sb.append("PRAFUL");
		sb.append("Khandelwal");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Khandelwal");
		sb1.append(sb);
		System.out.println(sb1);
		String str7 = "Test";
		str7 = "Plan";
		System.out.println("==============");
		System.out.println(str7);
				

	}

}
