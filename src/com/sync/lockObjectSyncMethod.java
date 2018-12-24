package com.sync;

public class lockObjectSyncMethod {
	private int i;

	synchronized void count() {
		i = i + 1;
		System.out.println(Thread.currentThread().getName() + " : " + i);
	}
}
