package com.sync;

public class demo_lockObjectSyncBlock {

	public static void main(String[] args) {
		final lockObjectSyncBlock losb1 = new lockObjectSyncBlock();
		final lockObjectSyncBlock losb2 = new lockObjectSyncBlock();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				losb1.count();

			}

		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				losb1.count();

			}

		});
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				losb2.count();

			}

		});
		Thread t4 = new Thread(new Runnable() {

			public void run() {
				losb2.count();

			}

		});

		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("T4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
