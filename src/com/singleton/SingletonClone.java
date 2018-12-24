package com.singleton;

public class SingletonClone implements Cloneable{

	private static SingletonClone sc = new SingletonClone();
	
	private SingletonClone(){};
	
	public static SingletonClone getInstance(){
		return sc;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
