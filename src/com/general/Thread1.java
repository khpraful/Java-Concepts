package com.general;
public class Thread1 extends Thread {
	ThreadLock lock;
	public Thread1(ThreadLock lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			for (int i = 0; i < 100; i = i + 2) {
				if (lock.tNum!=1)
				{
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
				}
				System.out.println(i);
				lock.notify();
				lock.tNum=2;

			}
		}
	}
}