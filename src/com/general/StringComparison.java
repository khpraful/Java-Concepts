package com.general;
import java.util.Scanner;

public class StringComparison {

	public static void main(String args[]) {

		String baseString = "ABCD";
		int baseLength = getLength(baseString);
		String inputString = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string:");
		inputString = scan.nextLine();
		int inputLength = getLength(inputString);
		int i = 0;
		int baseAscii = 0;
		int inputAscii = 0;
		if (inputLength == baseLength) {
			while (i < baseLength) {
				baseAscii = getAscii(baseString.charAt(i));
				inputAscii = getAscii(inputString.charAt(i));
				if ((baseAscii == inputAscii)
						|| (baseAscii - 97 == inputAscii - 65)
						|| (baseAscii - 65 == inputAscii - 97)) {
					i++;
				} else {
					break;
				}
			}
			if (i == baseLength) {
				System.out.println("Given String matches the Base String");
			} else {
				System.out.println("Given String doesn't match the Base String");
			}
		} else {
			System.out.println("Given String doesn't match the Base String");
		}
		scan.close();
	}

	private static int getAscii(char c) {
		int i = c;
		return i;
	}

	private static int getLength(String str) {
		int len = 0;
		try {
			while (str.charAt(len) != 0) {
				len++;
			}
		} catch (Exception e) {
		}
		return len;

	}

}
