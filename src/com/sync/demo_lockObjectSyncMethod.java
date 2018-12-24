package com.sync;

public class demo_lockObjectSyncMethod {
	public static void main(String[] args) {

		final lockObjectSyncMethod losm1 = new lockObjectSyncMethod();
		final lockObjectSyncMethod losm2 = new lockObjectSyncMethod();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				losm1.count();

			}

		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				losm1.count();

			}

		});
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				losm2.count();

			}

		});
		Thread t4 = new Thread(new Runnable() {

			public void run() {
				losm2.count();

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
