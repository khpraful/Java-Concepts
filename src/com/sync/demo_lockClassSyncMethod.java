package com.sync;

public class demo_lockClassSyncMethod {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				lockClassSyncMethod.count();

			}

		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				lockClassSyncMethod.count();

			}

		});
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				lockClassSyncMethod.count();

			}

		});
		Thread t4 = new Thread(new Runnable() {

			public void run() {
				lockClassSyncMethod.count();

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
