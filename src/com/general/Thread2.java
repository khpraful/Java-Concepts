package com.general;
public class Thread2 extends Thread {
	ThreadLock lock;
	public Thread2(ThreadLock lock){
        this.lock = lock;
    }

	public void run() {
		synchronized (lock) {
			for (int i = 1; i < 100; i = i + 2) {
				if (lock.tNum!=2)
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
				lock.tNum=1;

			}
		}
	}
}