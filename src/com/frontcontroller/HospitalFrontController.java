package com.frontcontroller;
public class HospitalFrontController {
	public void ServeRequest(String user, String request) {
		if (isRegistered(user)) {
			System.out.println("User is already registered. Sending to "
					+ request + " " + "Department");
			DepartmentDispatcher dispatcher = new DepartmentDispatcher();
			dispatcher.DispatcherRequest(request);
		}else
		{
			System.out.println("Please do the registration");
		}
	}

	public boolean isRegistered(String user) {
		if (user.equals("Praful")) {
			return true;
		} else {
			return false;
		}
	}
}
