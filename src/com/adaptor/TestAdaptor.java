package com.adaptor;

public class TestAdaptor {
	public static void main(String args[]) {
		ExcerciseEngland eE = new ExcerciseEngland();
		ExcerciseIndia eI = new ExcerciseIndia();
		ExcerciseUSA eU = new ExcerciseUSA();
		ExcerciseAdaptor eA = new ExcerciseAdaptor(eI, eU);
		eE.run();
		eE.gym();
		eA.run();
		eA.gym();

	}

}
