package com.singleton;

public class TestSingletonWithThreads {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Singleton obj1 = Singleton.getInstance();
				System.out.println(obj1);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Singleton obj2 = Singleton.getInstance();
				System.out.println(obj2);
			}
		});

		t1.start();
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		t2.start();
		
		Thread t3 = new Thread (new Runnable(){

			public void run() {
				SingletonNew obj3 = SingletonNew.getInstance();
				System.out.println(obj3);
			}
			
		});
		
		Thread t4 = new Thread (new Runnable(){

			public void run() {
				SingletonNew obj4 = SingletonNew.getInstance();
				System.out.println(obj4);
			}
			
		});
		
		t3.start();
		t4.start();

	}
}
