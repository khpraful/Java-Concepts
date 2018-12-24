package com.frontcontroller;
public class HospitalFrontControllerDemo {
	public static void main(String args[]) {
		HospitalFrontController hosp = new HospitalFrontController();
		String user = "Praful";
		String request = "ENT";
		hosp.ServeRequest(user, request);

	}
}