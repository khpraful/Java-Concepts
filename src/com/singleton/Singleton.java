package com.singleton;

public class Singleton {

	static Singleton obj = null;

	private Singleton() {
	}

	
	// public static Singleton getInstance() {
	/*
	 * public static synchronized Singleton getInstance() { if (obj == null) {
	 * obj = new Singleton(); } return obj; }
	 */
	public static Singleton getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null)
					obj = new Singleton();
			}
		}
		return obj;
	}

	
}
