package com.arraylist;

public class TestArrayList {

	public static void main(String[] args) {
		Object[] arr = ArrayListOperations.initializeArray("Integer", 10);
		for (int i = 0; i < 20; i++) {
			arr = ArrayListOperations.addItem(arr, i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + i + " : " + arr[i]);
		}
		arr = ArrayListOperations.removeItem(arr, 7);
		arr = ArrayListOperations.removeItem(arr, 17);
		arr = ArrayListOperations.removeItem(arr, 5);
		arr = ArrayListOperations.removeItem(arr, 0);
		arr = ArrayListOperations.removeItem(arr, 5);
		arr = ArrayListOperations.removeItem(arr, 50);
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Element " + i + " : " + arr[i]);
		}
	}

}
