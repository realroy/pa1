/**
 * @author Roiboon chaiyachit
 * */

package com.pa1.roiboon;

public class UnitFactory {
	/**
	 * Singleton class
	 * */
	private static final UnitFactory INSTANCE = new UnitFactory();

	/**
	 * @return insatance of this class
	 * */
	public static UnitFactory getInstance() { 
		return INSTANCE;
	}
	
	/**
	 * @return All unit's type
	 * */
	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	/**
	 * @return All unit
	 * */
	public Unit[] getUnits(UnitType ut) {
		return ut.getUnit();
	}
	
	/**
	 * @return value of new unit
	 * */
	public double convert(double amount, Unit fromUnit, Unit toUnit) {
		return (amount * fromUnit.getValue()) / toUnit.getValue();
	}
	
}
