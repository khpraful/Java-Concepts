package com.abs;

public abstract class LibraryAbstractMethod {
	void issuebook() {
		System.out.println("Book issued successfully");
	}

	void returnbook() {
		System.out.println("Book returned successfully");
	}

	abstract void manageinventory();
}

