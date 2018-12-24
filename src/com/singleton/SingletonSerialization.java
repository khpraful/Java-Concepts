package com.singleton;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {
	
	private static SingletonSerialization ss = new SingletonSerialization();
	int i;
	
	private SingletonSerialization(){};
	
	public static SingletonSerialization getInstance(){
		return ss;
	}

}
