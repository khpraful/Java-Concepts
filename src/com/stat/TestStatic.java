package com.stat;

public class TestStatic {

	public static void main(String[] args) {
		boolean b1 = Parent.testStatic();
		Parent p = new Parent();
		boolean b2 = p.testStatic();		
		boolean b3 = Child.testStatic();
		Child c = new Child();
		boolean b4 = c.testStatic();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

	}

}
