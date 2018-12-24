package com.arraylist;

public class ArrayListOperations {

	public static Object[] initializeArray(String arrType, int size) {
		if (arrType == "String") {
			return new String[size];
		} else if (arrType == "Integer") {
			return new Integer[size];
		} else {
			return null;
		}

	}

	public static Object[] extendArray(Object[] arr, int increment) {
		Object[] newarr = new Object[arr.length + increment];
		int i = 0;
		while (i < arr.length) {
			newarr[i] = arr[i];
			i++;
		}
		return newarr;
	}

	public static Object[] addItem(Object[] arr, int value) {
		int increment = 5;
		if (arr[arr.length - 1] != null) {
			arr = extendArray(arr, increment);
		}
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != null) {
				i++;
			} else {
				arr[i] = value;
				break;
			}
		}
		return arr;

	}

	public static Object[] removeItem(Object[] arr, int pos) {
		while (pos < arr.length - 1) {
			arr[pos] = arr[pos + 1];
			pos++;
			if (arr[pos] == null) {
				break;
			}
		}
		if (pos < arr.length) {
			arr[arr.length - 1] = null;
		}
		return arr;

	}

}
