package com.prototype;

public class Device {
	private int deviceId;
	private String deviceName;

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String toString() {
		return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName
				+ "]";
	}

}
