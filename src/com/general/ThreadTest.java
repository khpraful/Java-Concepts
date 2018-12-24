package com.general;
public class ThreadTest {

	public static void main(String args[]) {
		ThreadLock lock = new ThreadLock();
		Thread1 t1 = new Thread1(lock);
		Thread2 t2 = new Thread2(lock);
		t1.start();
		t2.start();
	}
}
