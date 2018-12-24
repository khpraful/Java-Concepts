package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class DeviceStore implements Cloneable {
	private String storeName;
	List<Device> devices = new ArrayList<>();

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public void loadDevices() {
		for (int i = 0; i <= 5; i++) {
			Device device = new Device();
			device.setDeviceId(i);
			device.setDeviceName("device " + i);
			getDevices().add(device);
		}

	}

	@Override
	// Deep Cloning
	protected DeviceStore clone() throws CloneNotSupportedException {
		DeviceStore store = new DeviceStore();
		for (Device d : this.getDevices()) {
			store.getDevices().add(d);
		}
		return store;
	}

	
	//@Override
	//Shallow Cloning 
	//protected Object clone() throws CloneNotSupportedException {
	//return super.clone();
	//}
	

	@Override
	public String toString() {
		return "DeviceStore [storeName=" + storeName + ", devices=" + devices
				+ "]";
	}

}
