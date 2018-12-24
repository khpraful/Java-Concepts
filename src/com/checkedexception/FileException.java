package com.checkedexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while ((str = br.readLine()) != null)
			System.out.println(str);

	}

}
