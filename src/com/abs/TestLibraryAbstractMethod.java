package com.abs;

public class TestLibraryAbstractMethod {

	public static void main(String[] args) {
		LibA a = new LibA();
		a.issuebook();
		a.returnbook();
		a.manageinventory();

		LibB b = new LibB();
		b.issuebook();
		b.returnbook();
		b.manageinventory();
		
		LibraryAbstractMethod LAMa = new LibA();
		LAMa.issuebook();
		LAMa.returnbook();
		LAMa.manageinventory();

		LibraryAbstractMethod LAMb = new LibB();
		LAMb.issuebook();
		LAMb.returnbook();
		LAMb.manageinventory();
		
	}

}
