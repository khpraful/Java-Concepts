package com.builder;

public class Health {
	private double height;
	private double weight;
	private double bloodPressure;
	private double sugar;
	private String bloodGroup;

	public Health(double height, double weight, double bloodPressure,
			double sugar, String bloodGroup) {
		super();
		this.height = height;
		this.weight = weight;
		this.bloodPressure = bloodPressure;
		this.sugar = sugar;
		this.bloodGroup = bloodGroup;
	}

	public String toString() {
		return "Health [height=" + height + ", weight=" + weight
				+ ", bloodPressure=" + bloodPressure + ", sugar=" + sugar
				+ ", bloodGroup=" + bloodGroup + "]";
	}

}
