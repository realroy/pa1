/**
 * @author Roiboon chaiyachit
 * */
package com.pa1.roiboon;

public enum UnitType {
	
	LENGTH(Length.values()),
	AREA(Area.values()),
	WEIGHT(Weight.values());
	
	private Unit[] unit;
	
	/**
	 * @param unit All unit
	 * */
	private UnitType(Unit[] unit) {
		this.setUnit(unit);
	}

	/**
	 * @return All unit
	 * */
	public Unit[] getUnit() {
		return unit;
	}

	private void setUnit(Unit[] unit) {
		this.unit = unit;
	}
}
