package com.inter;


public class TestLibraryInterface {

	public static void main(String[] args) {
		LibraryA a = new LibraryA();
		a.issuebook();
		a.returnbook();
		a.manageinventory();

		LibraryB b = new LibraryB();
		b.issuebook();
		b.returnbook();
		b.manageinventory();
		
		LibraryInterface LIa = new LibraryA();
		LIa.issuebook();
		LIa.returnbook();
		LIa.manageinventory();
		
		LibraryInterface LIb = new LibraryB();
		LIb.issuebook();
		LIb.returnbook();
		LIb.manageinventory();
	}

}
