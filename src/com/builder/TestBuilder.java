package com.builder;

public class TestBuilder {

	public static void main(String[] args) {
		Health h1 = new HealthBuilder().setHeight(182.01).setBloodGroup("O-")
				.setSugar(145.0).getHealth();
		Health h2 = new HealthBuilder().setHeight(167.34).setBloodGroup("A+")
				.getHealth();
		System.out.println(h1);
		System.out.println(h2);
	}
}
