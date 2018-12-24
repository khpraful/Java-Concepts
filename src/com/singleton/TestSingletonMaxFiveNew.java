package com.singleton;

public class TestSingletonMaxFiveNew {

	public static void main(String[] args) {

		SingletonMaxFiveNew s1 = SingletonMaxFiveNew.getInstance();
		SingletonMaxFiveNew s2 = SingletonMaxFiveNew.getInstance();
		SingletonMaxFiveNew s3 = SingletonMaxFiveNew.getInstance();
		SingletonMaxFiveNew s4 = SingletonMaxFiveNew.getInstance();
		SingletonMaxFiveNew s5 = SingletonMaxFiveNew.getInstance();
		SingletonMaxFiveNew s6 = SingletonMaxFiveNew.getInstance();
		SingletonMaxFiveNew s7 = SingletonMaxFiveNew.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}

}
