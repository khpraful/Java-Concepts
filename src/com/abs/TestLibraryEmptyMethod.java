package com.abs;

public class TestLibraryEmptyMethod {

	public static void main(String[] args) {
		LibC c = new LibC();
		c.issuebook();
		c.returnbook();
		c.manageinventory();

		LibD d = new LibD();
		d.issuebook();
		d.returnbook();
		d.manageinventory();
		
		LibraryEmptyMethod LAMc = new LibC();
		LAMc.issuebook();
		LAMc.returnbook();
		LAMc.manageinventory();

		LibraryEmptyMethod LAMd = new LibD();
		LAMd.issuebook();
		LAMd.returnbook();
		LAMd.manageinventory();

	}

}
