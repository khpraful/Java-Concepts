package com.singleton;

public class TestSingletonClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonClone sc1 = SingletonClone.getInstance();
		SingletonClone sc2 = SingletonClone.getInstance();
		SingletonClone sc3 = (SingletonClone) sc1.clone();
		SingletonClone sc4 = (SingletonClone) sc2.clone();
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		System.out.println(sc4);		

	}

}
