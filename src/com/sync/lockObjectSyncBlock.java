package com.sync;

public class lockObjectSyncBlock {
	private int i;

	void count() {
		synchronized (this) {
			i = i + 1;
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
