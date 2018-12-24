package com.singleton;

import java.util.Random;

public class SingletonMaxFive {

	private static int objCount = 0;
	private static SingletonMaxFive[] objArray = new SingletonMaxFive[5];

	public static SingletonMaxFive getInstance() {
		objCount++;
		if (objCount <= 5) {
			SingletonMaxFive obj = new SingletonMaxFive();
			objArray[objCount - 1] = obj;
			return obj;
		} else {
			Random r = new Random();
			int i = r.nextInt(4) + 1;
			return objArray[i];

		}

	}

}
