package com.pa1.roiboon;

public class UnitFactory {
	private static final UnitFactory INSTANCE = new UnitFactory();

	public static UnitFactory getInstance() { 
		return INSTANCE;
	}
	
	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	public Unit[] getUnits(UnitType ut) {
		return ut.getUnit();
	}
	
	public double convert(double amount, Unit fromUnit, Unit toUnit) {
		return (amount * fromUnit.getValue()) / toUnit.getValue();
	}
	
}
