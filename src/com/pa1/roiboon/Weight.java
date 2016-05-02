package com.pa1.roiboon;
/**
 * @author Roiboon chaiyachit
 * */
public enum Weight implements Unit {
	GRAM("Gram", 1),
	TONNE("Tonne", 1e+6),
	KILLOGRAM("Kilogram", 0.001),
	MILLIGRAM("Milligram", 1000),
	MICROGRAM("Microgram", 1e+6),
	IMPERIAL_TON("Imperial ton", 9.8421e-7),
	US_TON("US ton", 1.1023e-6),
	STONE("Stone", 0.000157473),
	POUND("Pound", 0.00220462),
	OUNCE("Ounce", 0.035274);
	

	private double value;
	private String name;
	
	/**Initial value of Weight
	 * @param name of unit
	 * @param value(in gram) of unit
	 * */
	private Weight(String name, double value) {
		this.name 	= name;
		this.value 	= value;
	}
	
	/**get the unit's name
	*@return name of unit
	*/
	public String getName() {
		return this.name;
	}
	
	/**get the unit's name
	*@return name of unit
	*/
	@Override
	public double getValue() {
		return this.value;
	}
	
	/**
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return this.name;
	}
	
}
