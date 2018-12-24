package com.frontcontroller;

public class DepartmentDispatcher {
	CardiologyView cardio = new CardiologyView();
	ENTView ent = new ENTView();
	OrthopedicView ortho = new OrthopedicView();
	
	public void DispatcherRequest (String request){
		if (request.equals("CARDIOLOGY")){
			cardio.view();
		}
		else if (request.equals("ENT")){
			ent.view();
		}
		else if (request.equals("ORTHOPEDIC")){
			ortho.view();
		}
		else{
			System.out.println("Sorry, this service not available!");
		}
	}

}



