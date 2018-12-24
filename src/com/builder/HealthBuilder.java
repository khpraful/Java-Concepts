package com.builder;

public class HealthBuilder {
	private double height;
	private double weight;
	private double bloodPressure;
	private double sugar;
	private String bloodGroup;

	public HealthBuilder setHeight(double height) {
		this.height = height;
		return this;
	}

	public HealthBuilder setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	public HealthBuilder setBloodPressure(double bloodPressure) {
		this.bloodPressure = bloodPressure;
		return this;
	}

	public HealthBuilder setSugar(double sugar) {
		this.sugar = sugar;
		return this;
	}

	public HealthBuilder setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
		return this;
	}

	public Health getHealth() {
		return new Health(height, weight, bloodPressure, sugar, bloodGroup);
	}
}
