package com.singleton;

public class SingletonNew {
	
	private static SingletonNew s = new SingletonNew();
	
	
	public static SingletonNew getInstance(){
		return s;
	}

}
