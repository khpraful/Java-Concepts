package com.abs;

public class TestLibraryRegularMethod {
	public static void main(String[] args) {
		LibE e = new LibE();
		e.issuebook();
		e.returnbook();
		e.manageinventory();

		LibF f = new LibF();
		f.issuebook();
		f.returnbook();
		f.manageinventory();
		
		LibraryRegularMethod LAMe = new LibE();
		LAMe.issuebook();
		LAMe.returnbook();
		LAMe.manageinventory();

		LibraryRegularMethod LAMf = new LibF();
		LAMf.issuebook();
		LAMf.returnbook();
		LAMf.manageinventory();

	}
}
