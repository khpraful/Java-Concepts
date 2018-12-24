package com.uncheckedexception;

public class ClassCastException {

	public static void main(String[] args) {
		Object i = Integer.valueOf(123);
		String str = (String) i;
	

	}

}
