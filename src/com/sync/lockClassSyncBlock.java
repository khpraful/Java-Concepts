package com.sync;

public class lockClassSyncBlock {
	private static int i;

	static void count() {

		synchronized (lockClassSyncBlock.class) {
			i = i + 1;
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
