package com.general;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		try {
			String baseString = "This is a base string";
			String subString = "";
			int startPos = 0;
			int endPos = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter starting position");
			startPos = scan.nextInt();
			System.out.println("Enter ending position");
			endPos = scan.nextInt();
			subString = baseString.substring(startPos, endPos);
			System.out.println("Substring value based on given positions is: "
					+ subString);
			scan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
