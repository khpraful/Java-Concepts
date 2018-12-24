package com.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingletonSerialization {

	public static void main(String[] args) throws Exception {
		SingletonSerialization ss1 = SingletonSerialization.getInstance();
		ss1.i = 1;
		System.out.println(ss1);
		System.out.println(ss1.i);
		
		File f = new File ("Singleton.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ss1);
		oos.close();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		SingletonSerialization ss2 = (SingletonSerialization) ois.readObject();
		ss2.i = 2;
		System.out.println(ss2);
		System.out.println(ss2.i);
		
		
		
		

	}

}
