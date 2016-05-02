package com.pa1.roiboon;
/**
 * @author Roiboon chaiyachit
 * */
public enum Area implements Unit {
	SQUARE_METRE("Square metre", 1),
	SQUARE_KILOMETER("Square kilometre", 1E+6),
	SQUARE_MILE("Square mile", 2.59e+6),
	SQUARE_YARD("Square yard", 0.836127),
	SQUARE_FOOT("Square foot", 0.092903),
	SQUARE_INCH("Square inch", 0.00064516),
	SQUARE_HECTARE("Hectare", 1000),
	SQUARE_ACRE("Square Acre", 4046.86),
	SQUARE_WA("Square wa", 4);
	

	private double value;
	private String name;
	
	private Area(String name, double value) {
		this.name 	= name;
		this.value 	= value;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public double getValue() {
		return this.value;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
