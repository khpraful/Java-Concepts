package com.singleton;

public class TestSingletonMaxFive {

	public static void main(String[] args) {
		SingletonMaxFive s1 = SingletonMaxFive.getInstance();
		SingletonMaxFive s2 = SingletonMaxFive.getInstance();
		SingletonMaxFive s3 = SingletonMaxFive.getInstance();
		SingletonMaxFive s4 = SingletonMaxFive.getInstance();
		SingletonMaxFive s5 = SingletonMaxFive.getInstance();
		SingletonMaxFive s6 = SingletonMaxFive.getInstance();
		SingletonMaxFive s7 = SingletonMaxFive.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}

}
