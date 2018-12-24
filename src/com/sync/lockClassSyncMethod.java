package com.sync;

public class lockClassSyncMethod {
	private static int i;

	static synchronized void count() {
		i = i + 1;
		System.out.println(Thread.currentThread().getName() + " : " + i);
	}

}
