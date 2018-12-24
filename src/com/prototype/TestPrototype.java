package com.prototype;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeviceStore ds = new DeviceStore();
		ds.setStoreName("Expedia");
		ds.loadDevices();
		DeviceStore ds1 = (DeviceStore) ds.clone();
		ds1.setStoreName("Explore");
		ds.getDevices().remove(2);
		System.out.println(ds);
		System.out.println(ds1);
	}

}
