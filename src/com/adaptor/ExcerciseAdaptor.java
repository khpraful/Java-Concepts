package com.adaptor;

public class ExcerciseAdaptor implements Excercise {

	ExcerciseIndia eI = new ExcerciseIndia();
	ExcerciseUSA eU = new ExcerciseUSA();

	public ExcerciseAdaptor(ExcerciseIndia eI, ExcerciseUSA eU) {
		this.eI = eI;
		this.eU = eU;
	}

	public void run() {
		eI.walk();
		eU.crawl();

	}

	public void gym() {
		eI.yoga();

	}

}
