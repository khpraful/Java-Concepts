package com.singleton;

import java.util.Random;

public class SingletonMaxFiveNew {
	
	
	private static SingletonMaxFiveNew s1 = new SingletonMaxFiveNew();
	private static SingletonMaxFiveNew s2 = new SingletonMaxFiveNew();
	private static SingletonMaxFiveNew s3 = new SingletonMaxFiveNew();
	private static SingletonMaxFiveNew s4 = new SingletonMaxFiveNew();
	private static SingletonMaxFiveNew s5 = new SingletonMaxFiveNew();
	private static SingletonMaxFiveNew[] objArray = new SingletonMaxFiveNew[5];
	private static SingletonMaxFiveNew[] objArray1 = populateObjects();

	private static SingletonMaxFiveNew[] populateObjects(){
		objArray[0] = s1;
		objArray[1] = s2;
		objArray[2] = s3;
		objArray[3] = s4;
		objArray[4] = s5;
		
		return objArray;
	}
	
	public static SingletonMaxFiveNew getInstance(){
		Random r = new Random();
		int i = r.nextInt(4) + 1;
		return objArray[i];
	}
	

}
