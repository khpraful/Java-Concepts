package com.general;
public class testClass {

	public static void main(String args[]) throws Exception {

		/*
		 * System.out.println("Class.forName(abc) result");
		 * Class.forName("abc");
		 * System.out.println("Class.forName(abc).newInstance() result");
		 * Class.forName("abc").newInstance();
		 */
		System.out.println("abc a1 = new abc() result");
		abc a1 = new abc();
		System.out.println("abc a2 = new abc() result");
		abc a2 = new abc();

	}

}

class abc {

	static {
		// called only once when class is loaded in memory
		System.out.println("Within static");
	}
	{
		System.out.println("Within instance");
	}
}